package com.ljj.springboot_redis.controller;

import com.ljj.springboot_redis.entity.User;
import com.ljj.springboot_redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: ljj
 * @Date: 2019/9/4 10:07
 * @Description:
 */
@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
}
