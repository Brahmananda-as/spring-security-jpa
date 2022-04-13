package com.shiva.springsecurityjpa.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shiva")
public class HomeControllers {

    @GetMapping("/")
    public String showHome(){

        return "home";
    }

}
