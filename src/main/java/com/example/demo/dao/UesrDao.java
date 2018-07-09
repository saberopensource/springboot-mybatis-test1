package com.example.demo.dao;

import com.example.demo.entity.UserEntity;
import org.apache.ibatis.annotations.*;

/**
 * @author baiyang
 * @Email: 1419408386@qq.com
 * @DATE : 2018-07-09
 * @MESSAGE: 如果看不懂先debug，不知道就来问我
 */
@Mapper
public interface UesrDao {
    @Select("select * from user where username = #{username}")
    public UserEntity findUserName(@Param("username")String userName);
    @Insert("insert into user(username,age,phoneNum) values(#{username},#{age},#{phoneNum})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int insertUser(@Param("username")String username,@Param("age")int age,@Param("phoneNum")String phoneNum);
}
