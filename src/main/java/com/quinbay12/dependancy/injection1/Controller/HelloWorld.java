package com.quinbay12.dependancy.injection1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/Greet")
        String Greet() {
        return "Helllo";
    }
    }


