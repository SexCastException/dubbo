package com.huazai.boot.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class BootUserServiceProviderApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("服务提供者启动。。。。");
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        System.out.println("服务提供者启动完成！！");
        // 输入任意内容结束服务
        System.in.read();
    }
}
