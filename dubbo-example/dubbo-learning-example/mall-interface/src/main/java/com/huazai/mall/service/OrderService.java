package com.huazai.mall.service;


import com.huazai.mall.bean.UserAddress;

import java.util.List;

public interface OrderService {

    /**
     * 初始化订单
     *
     * @param userId
     */
    List<UserAddress> initOrder(String userId);

}
