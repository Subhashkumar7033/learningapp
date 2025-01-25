package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    public WelcomeController() {
      System.out.println("This is no Arg Constructor!")
    }
// This is Get api to display the welcome message
    @GetMapping("/")
    public String getWelcomeMessage() {
        return "WELCOME SUBHASH!";
    }
}
