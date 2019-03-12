package com.tfb.consumer.controller;



import com.tfb.consumer.remote.UserAPI;
import com.tfb.model.entity.Userinfo;
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
    UserAPI userAPI;

    @PostMapping("/user")
    @ApiOperation("添加用户")
    public Userinfo addUserInfo(Userinfo userinfo){
        return userAPI.addUserInfo(userinfo);
    }


    @GetMapping("/user")
    @ApiOperation("查询所有用户")
    public List<Userinfo> findAllUserInfo() {
        return userAPI.findAllUserInfo();
    }
}
