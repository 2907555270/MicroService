package com.hand.demo.order.infra.feign.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 16:26
 */
@Component
public class SimpleRequestInterceptor implements RequestInterceptor {

    @Autowired
    private Logger logger;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        logger.info("=================================");
        logger.info("截取到一个请求");
        Collection<String> requestVariables = requestTemplate.getRequestVariables();
        requestVariables.forEach(item->{
            logger.debug(item);
        });
    }
}
