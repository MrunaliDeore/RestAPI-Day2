package com.example.firstspringprogram.controller;

import com.example.firstspringprogram.entity.User;
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

    //localhost:8080/param/Mrunali
    @GetMapping("/param/{name}")
    public String getByNameParam(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/hellobyname/{name}")
    public String getHello(@PathVariable String name){
        return "Hello "+name;
    }

   //localhost:8080/post
    @PostMapping("/post")
    public String getFirstNameLastName(@RequestBody User user){
        return "Hello "+ user.getFirstname() + "" + user.getLastname();
    }

    //localhost8080:/put/Mrunali/?lastname=Deore
    @PutMapping("/put/{firstname}")
    public String getFirstName(@PathVariable String firstname,@RequestParam(value ="lastname") String lastname){
        return "Hello " + firstname + " " + lastname;
    }
}
