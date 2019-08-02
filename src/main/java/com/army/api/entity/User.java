package com.army.api.entity;

import io.swagger.annotations.ApiModelProperty;

public class User {

    @ApiModelProperty(required = true, value = "名字")
    public String name = "";

    @ApiModelProperty(required = true, value = "年齡")
    public int age = 0;
}
