package com.example.demo.service;

import com.example.demo.dao.UserEntityMapper;
import com.example.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author baiyang
 * @Email: 1419408386@qq.com
 * @DATE : 2018-07-09
 * @MESSAGE: 如果看不懂先debug，不知道就来问我
 */
@Service
public class UserService {
    //装配自动注入
    @Autowired
    private UserEntityMapper uesrDao;

    public UserEntity selectByPrimaryKey(long id){
        return uesrDao.selectByPrimaryKey(id);
    }

    public void insertUser(UserEntity userEntity){
            uesrDao.insert(userEntity);
    }

}
