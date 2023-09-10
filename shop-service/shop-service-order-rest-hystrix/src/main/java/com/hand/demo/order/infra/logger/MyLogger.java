package com.hand.demo.order.infra.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 16:40
 */
@Component
public class MyLogger {

    @Bean("logger")
    public Logger getLogger(){
        return LoggerFactory.getLogger("logger");
    }

}
