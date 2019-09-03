package com.huazai.boot.provider.service;

import com.huazai.mall.bean.UserAddress;
import com.huazai.mall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;


public class UserServiceStub implements UserService {
    private final UserService userService;

    /**
     * 传入的是userService远程的代理对象
     *
     * @param userService
     */
    public UserServiceStub(UserService userService) {
        super();
        this.userService = userService;
    }

    public List<UserAddress> getUserAddressList(String s) {
        System.out.println("UserServiceStub.....");
        if (!StringUtils.isEmpty(null)) {
            return userService.getUserAddressList(null);
        }
        return null;
    }
}