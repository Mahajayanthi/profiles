package com.example.profiles.profiles.service;

import com.example.profiles.profiles.entity.User;
import com.example.profiles.profiles.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value={"dev","prod","qa","local"})
public class UserService {
    @Autowired
    private UserRepository repo;


    public List<User>getUser(){
        return repo.findAll();

    }

    public List<User> getUsers() {
        return repo.findAll();
    }
}
