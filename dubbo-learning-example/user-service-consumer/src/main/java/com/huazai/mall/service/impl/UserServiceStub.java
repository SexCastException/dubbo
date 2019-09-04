package com.huazai.mall.service.impl;

import com.huazai.mall.bean.UserAddress;
import com.huazai.mall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;


public class UserServiceStub implements UserService {
    private final UserService userService;

    /**
     * 传入的是实际调用的userService远程的代理对象，必须有一个带参的构造函数
     *
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }

    public List<UserAddress> getUserAddressList(String s) {
        System.out.println("UserServiceStub.....");
        if (!StringUtils.isEmpty(s)) {
            return userService.getUserAddressList(s);
        }
        return null;
    }
}