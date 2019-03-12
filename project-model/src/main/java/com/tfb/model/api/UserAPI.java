package com.tfb.model.api;


import com.tfb.model.entity.Userinfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author leish
 * @create 2019-03-11
 **/
@FeignClient(name = "project-provider")
public interface UserAPI {

    @PostMapping("/api/user")
    Userinfo addUserInfo(Userinfo userinfo);

    @GetMapping("/api/user")
    List<Userinfo> findAllUserInfo();
}
