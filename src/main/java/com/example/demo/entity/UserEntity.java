package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

/**
 * @author baiyang
 * @Email: 1419408386@qq.com
 * @DATE : 2018-07-09
 * @MESSAGE: 如果看不懂先debug，不知道就来问我
 */
public class UserEntity {
    @Getter
    @Setter
    protected int id;
    @Getter
    @Setter
    @Column(length = 255)
    private String username;
    @Getter
    @Setter
    @Column(length = 2)
    private int age;
    @Getter
    @Setter
    @Column(length = 11)
    private String phoneNum;

    public UserEntity() {
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", phoneNum=" + phoneNum +
                '}';
    }

    public UserEntity(int id, String username, int age, String phoneNum) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.phoneNum = phoneNum;
    }
}
