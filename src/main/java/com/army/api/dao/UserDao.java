package com.army.api.dao;

import com.army.api.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

    @Insert("insert into user(s_name, s_age) values(#{user.name},#{user.age})")
    int insertUser(@Param("user") User user);


    @Select("select * from user")
    @Results({
            @Result(property = "name", column = "s_name"),
            @Result(property = "age", column = "s_age")
    })
    List<User> queryUsers();
}
