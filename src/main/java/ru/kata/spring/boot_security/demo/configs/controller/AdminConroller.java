package ru.kata.spring.boot_security.demo.configs.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminConroller {

        @GetMapping("/Admin")
        public String helloAdmin(){
            return "Admin panel";
        }


}
