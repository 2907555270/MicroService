package com.hand.demo.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 11:33
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.hand.demo.product")
@EntityScan(basePackages = "com.hand.demo.common.entity")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}
