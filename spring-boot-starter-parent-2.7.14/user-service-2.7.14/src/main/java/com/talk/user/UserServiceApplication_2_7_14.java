package com.talk.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = "com.talk")
public class UserServiceApplication_2_7_14 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication_2_7_14.class, args);
    }
}
