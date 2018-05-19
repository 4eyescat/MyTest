package com.example.demo.com.example.bean;

import lombok.Data;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/2 下午2:16
 */
@Data
public class User extends BaseBean{
    private String account;

    private String password;

    private String checkCode;

    private short userType;


}
