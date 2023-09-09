package com.hand.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 12:30
 */
@EnableDiscoveryClient
@EnableEurekaClient
@EntityScan(basePackages = "com.hand.demo.common.entity")
@SpringBootApplication(scanBasePackages = "com.hand.demo.user")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
