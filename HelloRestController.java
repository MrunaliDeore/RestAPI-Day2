package com.example.firstspringprogram.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
   //localhost:8080/hello
    @RequestMapping("/hello")
    public String getHome() {
       return "Hello From Mrunali";
    }

    //localhost:8080/query?name=Mrunali
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String getByName(@RequestParam(value = "name") String name){
       return "Hello "+ name;
    }
}
