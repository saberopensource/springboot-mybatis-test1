package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baiyang
 * @Email: 1419408386@qq.com
 * @DATE : 2018-07-09
 * @MESSAGE: 如果看不懂先debug，不知道就来问我
 */
@RestController
@RequestMapping("/a")
@EnableAutoConfiguration
public class UserController {
        @Autowired
        private UserService userService;

        private UserEntity userEntity;
        @RequestMapping("/query")
        public UserEntity testQuery(){
            return userService.findService(
                    "baiyang");
        }

        @RequestMapping("/insert")
        public UserEntity testInsert(){
            userService.insertService(userEntity);
            return userService.findService("tanqiyu");
        }
}
