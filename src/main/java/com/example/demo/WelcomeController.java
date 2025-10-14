package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    @RequestMapping("/welcome")
    String welcome() {
        return "Hello there";
    }

    @RequestMapping("/")
    String index() {
        return "<html> <h1> This is the index of this wonderful thing </h1> <!html>";
    }

    @RequestMapping("/index.html")
    String hell() {
        return "<html> <h1> You have no files here! </h1> <!html>";
    }
}
