package com.example.firstspringprogram.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
   @RequestMapping("/hello")
    public String getHome() {
       return "Hello From Mrunali";
    }

}
