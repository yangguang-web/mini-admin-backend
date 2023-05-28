package com.example.springboot_vue.controller;


import com.example.springboot_vue.entity.User;
import com.example.springboot_vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping ("/all")
    public List<User> findAll(){
        return userService.findAll();
    }

}
