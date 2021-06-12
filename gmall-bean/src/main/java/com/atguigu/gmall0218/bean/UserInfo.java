package com.atguigu.gmall0218.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 实体类包含 属性，get set 方法
@Data
public class UserInfo {

    // 通用mapper 的注解
    @Id // 表示主键
    @Column // 普通字段列
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 获取数据库主键自增！ mysql  GenerationType.IDENTITY  oracle :GenerationType.AUTO
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;


}
