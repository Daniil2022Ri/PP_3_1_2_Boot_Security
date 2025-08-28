package ru.kata.spring.boot_security.demo.configs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserConroller {

    @GetMapping("/User")
    public String userhello() {
        return "Hello world User Panel!";
    }
}
