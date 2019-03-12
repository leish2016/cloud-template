package com.tfb.provider.controller;


import com.tfb.provider.entity.Userinfo;
import com.tfb.provider.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(description = "用户操作服务")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    @ApiOperation("添加用户")
    public Userinfo addUserInfo(Userinfo userinfo){
        return userService.addUser(userinfo);
    }


    @GetMapping("/user")
    @ApiOperation("查询所有用户")
    public List<Userinfo> findAllUserInfo() {
        return userService.getAll();
    }
}
