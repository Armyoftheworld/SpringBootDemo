package com.army.api.service;

import com.army.api.dao.UserDao;
import com.army.api.entity.User;
import com.army.api.response.Response;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public Response addUser(User user) {
        int id = userDao.insertUser(user);
        if (id > 0) {
            return Response.createSuccess();
        }
        return Response.createFailure("insert failure");
    }

    public Response queryUsers() {
        return Response.createSuccess(userDao.queryUsers());
    }
}
