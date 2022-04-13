package com.shiva.springsecurityjpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AdminController {

    @GetMapping("admin")
    public String showAdmin(){

        return "Welcome admin";
    }
}
