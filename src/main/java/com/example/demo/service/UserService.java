package com.example.demo.service;

import com.example.demo.dao.UesrDao;
import com.example.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    private UesrDao uesrDao;

    public UserEntity findService(String username){
        return uesrDao.findUserName(username);
    }

    public void insertService(UserEntity userEntity){
            uesrDao.insertUser("baiyang",26,"85894584445");
    }

}
