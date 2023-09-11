package com.hand.demo.customer.myRule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 14:14
 */
@Configuration
public class MyBalancedRoleConfig {

    @Bean
    public IRule myRule(){
        return new myRandomRule();
    }
}
