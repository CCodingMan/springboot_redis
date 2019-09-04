package com.ljj.springboot_redis.jpa;

import com.ljj.springboot_redis.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: ljj
 * @Date: 2019/9/4 10:00
 * @Description:
 */
public interface UserJPA extends JpaRepository<User, Integer> {

}
