package com.ljj.springboot_redis.service;

import com.ljj.springboot_redis.entity.User;
import com.ljj.springboot_redis.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: ljj
 * @Date: 2019/9/4 10:02
 * @Description:
 */
@Service
@CacheConfig(cacheNames = "user")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserJPA userJPA;

    @Override
    @Cacheable
    public List<User> findAll() {
        return userJPA.findAll();
    }
}
