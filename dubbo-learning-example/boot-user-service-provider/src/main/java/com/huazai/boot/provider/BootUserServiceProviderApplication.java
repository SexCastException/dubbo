package com.huazai.boot.provider;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@EnableDubbo
@SpringBootApplication
public class BootUserServiceProviderApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
    }
}
