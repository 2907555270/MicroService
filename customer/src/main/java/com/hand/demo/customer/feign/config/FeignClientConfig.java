package com.hand.demo.customer.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 14:47
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public Logger.Level feignClientLogLevel(){
        return Logger.Level.FULL;
    }
}
