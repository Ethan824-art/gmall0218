package com.atguigu.gmall0218.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0218.bean.UserAddress;
import com.atguigu.gmall0218.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {

    @Reference
    private UserService userService;

//    @GetMapping("trade")
//    public String index(){
//        return "index";
//    }

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> trade(String userId){

        return userService.getUserAddressList(userId);
    }
}
