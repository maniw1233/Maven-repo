package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to My Web App!");
        return "index"; // maps to src/main/resources/templates/index.html
    }
}

