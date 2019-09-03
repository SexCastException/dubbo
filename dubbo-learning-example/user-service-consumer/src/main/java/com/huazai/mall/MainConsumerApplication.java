package com.huazai.mall;

import java.io.IOException;
import java.util.List;

import com.huazai.mall.bean.UserAddress;
import com.huazai.mall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConsumerApplication {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		System.out.println("服务消费者启动。。。");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
		applicationContext.start();
		OrderService orderService = applicationContext.getBean(OrderService.class);

		List<UserAddress> userAddresses = orderService.initOrder("1");
		System.out.println("服务消费者调用结果：");
		System.out.println(userAddresses);

		System.out.println("服务消费者调用完成。。");
		System.in.read();
	}

}
