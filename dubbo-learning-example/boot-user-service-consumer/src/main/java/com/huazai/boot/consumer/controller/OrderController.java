package com.huazai.boot.consumer.controller;

import com.huazai.mall.bean.UserAddress;
import com.huazai.mall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public String initOrder(@RequestParam String userId) {
        List<UserAddress> userAddressList = orderService.initOrder(userId);
        return userAddressList + "";
    }
}
