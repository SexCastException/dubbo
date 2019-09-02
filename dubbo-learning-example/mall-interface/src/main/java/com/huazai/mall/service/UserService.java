package com.huazai.mall.service;


import com.huazai.mall.bean.UserAddress;

import java.util.List;

/**
 * 用户服务
 *
 * @author pyh
 */
public interface UserService {

    /**
     * 按照用户id返回所有的收货地址
     *
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);

}
