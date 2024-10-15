package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "todoList";
    }

    @GetMapping("/user")
    public String getUser() {
        return "82212548";
    }
}
