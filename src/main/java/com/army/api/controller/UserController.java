package com.army.api.controller;

import com.army.api.entity.User;
import com.army.api.response.Response;
import com.army.api.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api("用户相关")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "添加用户")
    @RequestMapping(path = "/addUser", produces = {"application/json;charset=UTF-8"}, method = RequestMethod.POST)
    public Response insertUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @ApiOperation(value = "查询用户")
    @RequestMapping(path = "/users", produces = "application/json;charset=utf-8", method = RequestMethod.POST)
    public Response queryUsers() {
        return userService.queryUsers();
    }
}
