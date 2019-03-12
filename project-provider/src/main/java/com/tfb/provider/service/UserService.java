package com.tfb.provider.service;


import com.tfb.provider.entity.Userinfo;
import com.tfb.provider.mapper.UserinfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
@Slf4j
public class UserService {

    @Autowired
    UserinfoMapper userInfoMapper;

    public Userinfo addUser(Userinfo userinfo) {
        userinfo.setCreateAt(new Date());
        userInfoMapper.insertSelective(userinfo);
        return userInfoMapper.selectOne(userinfo);
    }

    public List<Userinfo> getAll(){
        return userInfoMapper.selectAll();
    }

    

}
