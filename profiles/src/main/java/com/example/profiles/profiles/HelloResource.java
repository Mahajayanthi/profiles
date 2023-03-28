package com.example.profiles.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/hi")
@RestController
public class HelloResource {

    public String message;
@GetMapping("/dev")
    public String hello(){
    return message;
    }

}
