package com.ljj.springboot_redis.service;

import com.ljj.springboot_redis.entity.User;

import java.util.List;

/**
 * @author: ljj
 * @Date: 2019/9/4 10:02
 * @Description:
 */
public interface UserService {
    List<User> findAll();
}
