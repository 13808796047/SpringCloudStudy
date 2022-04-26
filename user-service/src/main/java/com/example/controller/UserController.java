package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author Summer
 * @Since 2022/4/26 10:02 AM
 * @Version 1.0
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Resource
    UserService userService;
    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
