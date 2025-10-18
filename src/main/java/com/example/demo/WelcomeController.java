package com.example.demo;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @GetMapping("/")
    String hell() {
        return "index";
    }

    @GetMapping("/hello")
    String myMethod(@RequestParam Optional<String> name, Model model) {

        model.addAttribute("name", name.orElse("World"));

        return "hello";
    }
}
