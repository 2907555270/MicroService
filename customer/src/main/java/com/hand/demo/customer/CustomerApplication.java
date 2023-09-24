package com.hand.demo.customer;

import com.hand.demo.customer.infra.myRule.MyBalancedRoleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 14:29
 */
@EnableEurekaClient
@RibbonClient(name = "producer",configuration = MyBalancedRoleConfig.class)
@EnableFeignClients(basePackages = "com.hand.demo.customer.infra.feign")
@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
