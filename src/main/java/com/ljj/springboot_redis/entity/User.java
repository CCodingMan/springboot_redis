package com.ljj.springboot_redis.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: ljj
 * @Date: 2019/9/4 09:35
 * @Description:
 */
@Data
@Builder
@Table(name = "user")
@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1165707481378215346L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "age")
    private int age;

    @Column(name = "sex")
    private String sex;

    @Column(name = "name")
    private String name;

    @Tolerate
    public User() {
    }
}
