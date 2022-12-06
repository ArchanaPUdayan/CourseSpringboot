package com.example.Courseapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {
    @PostMapping("/")
    public String Addpage(){
        return "Welcome to my add page";
    }
    @PostMapping("/view")
    public String viewpage(){
        return "Welcome to my view page";
    }
}
