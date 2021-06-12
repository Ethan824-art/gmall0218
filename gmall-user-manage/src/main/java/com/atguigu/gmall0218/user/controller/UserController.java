package com.atguigu.gmall0218.user.controller;


import com.atguigu.gmall0218.bean.UserInfo;
import com.atguigu.gmall0218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("findAll")
    public List<UserInfo> findAll(){

        List<UserInfo> list = userService.findAll();
        return list;
    }
}
