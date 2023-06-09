package com.example.profiles.profiles.controller;

import com.example.profiles.profiles.entity.User;
import com.example.profiles.profiles.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;
    @GetMapping("/findAllUsers")
    public List<User> findAllUsers()
    {
      return service.getUsers();
    }
}

