package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// html를 전달하는 일반 @Controller 

@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "home/index";
    }
}
