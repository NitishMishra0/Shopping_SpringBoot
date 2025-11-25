package com.nitish.Shopping_SpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Nitish Homepage!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome to abuot page!!";
    }

}
