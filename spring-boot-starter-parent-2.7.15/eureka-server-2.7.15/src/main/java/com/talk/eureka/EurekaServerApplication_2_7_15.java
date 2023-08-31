package com.talk.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication_2_7_15 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_2_7_15.class, args);
    }
}
