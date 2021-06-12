package com.atguigu.gmall0218.service;

import com.atguigu.gmall0218.bean.UserAddress;
import com.atguigu.gmall0218.bean.UserInfo;

import java.util.List;

public interface UserService {

    /*
    查询所有数据
     */
    List<UserInfo> findAll();

    /**
     * 根据userId 查询用户地址列表
     */
    List<UserAddress> getUserAddressList(String userId);
}
