package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Cambodia";
    }

    @RequestMapping("/about")
    public String about(){
        return "We don't teach, we Educate!!";
    }
}
