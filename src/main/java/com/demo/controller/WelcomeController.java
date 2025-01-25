package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
// This is Get api to display the welcome message
    @GetMapping("/")
    public String getWelcomeMessage() {
        return "WELCOME SUBHASH!";
    }
}
