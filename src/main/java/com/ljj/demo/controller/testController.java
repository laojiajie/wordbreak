package com.ljj.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping("test")
    public String test() {
        return "Hello this is a springboot test.";
    }

}