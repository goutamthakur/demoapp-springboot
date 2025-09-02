package com.goutamthakur.demoapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Home page";
    }

    @RequestMapping("/health")
    public String health(){
        return "OK";
    }
}
