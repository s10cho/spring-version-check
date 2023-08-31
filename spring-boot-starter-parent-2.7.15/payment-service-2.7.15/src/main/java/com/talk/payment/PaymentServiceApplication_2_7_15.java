package com.talk.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = "com.talk")
public class PaymentServiceApplication_2_7_15 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication_2_7_15.class, args);
    }
}
