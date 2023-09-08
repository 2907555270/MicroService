package com.hand.dmeo.eureka7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description
 *
 * @author EMP_44294 2023/09/08 14:46
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka7003Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7003Application.class, args);
    }
}
