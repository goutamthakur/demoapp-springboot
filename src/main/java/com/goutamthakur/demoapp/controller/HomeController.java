package com.goutamthakur.demoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello from spring boot 👋";
    }

    @RequestMapping("/about")
    public String about(){
        return "Learning Spring Boot";
    }
}
