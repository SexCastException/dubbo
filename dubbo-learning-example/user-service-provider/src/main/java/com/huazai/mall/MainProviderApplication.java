package com.huazai.mall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainProviderApplication {
	public static void main(String[] args) throws IOException {
		System.out.println("服务提供者启动。。。。");
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
		ioc.start();

		System.out.println("服务提供者启动完成！！");
		// 输入任意内容结束服务
		System.in.read();
	}
}
