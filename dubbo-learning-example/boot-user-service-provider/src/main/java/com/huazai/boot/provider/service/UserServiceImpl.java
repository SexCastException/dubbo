package com.huazai.boot.provider.service;


import com.huazai.mall.bean.UserAddress;
import com.huazai.mall.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String s) {
        System.out.println("UserServiceImpl.....old...");
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList(address1, address2);
    }
}
