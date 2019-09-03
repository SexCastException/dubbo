package com.huazai.boot.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/*
开启基于注解的dubbo功能
 */
@EnableDubbo
@SpringBootApplication
public class BootUserServiceConsumerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(BootUserServiceConsumerApplication.class, args);
    }

}
