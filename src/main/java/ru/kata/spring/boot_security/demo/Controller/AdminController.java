package ru.kata.spring.boot_security.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class AdminController {
    private final UserService userService;

    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String userPage(Model model, Principal principal) {
        model.addAttribute("user", userService.getUserByUsername(principal.getName()));
        return "user";
    }

    @GetMapping("/admin")
    public String adminPage(Model model, Principal principal) {
        model.addAttribute("admin", userService.getUserByUsername(principal.getName()));
        return "admin";
    }

    @GetMapping("/index")
    public String viewHomePage(Model model) {
        List<User> users = userService.listAll();
        model.addAttribute("users", users);

        return "index";
    }

    @GetMapping("/new")
    public String showNewUserPage(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "new_user";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user) {
        userService.save(user);

        return "redirect:/index";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditUserPage(@PathVariable(name = "id")Long id) {
        ModelAndView mav = new ModelAndView("edit_user");
        User user = userService.get(id);
        mav.addObject("user", user);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable(name = "id")Long id){
        userService.delete(id);
        return "redirect:/index";
    }

}
