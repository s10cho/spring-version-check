package com.talk.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication_2_7_14 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication_2_7_14.class, args);
    }
}
