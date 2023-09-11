package com.hand.demo.customer.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 14:21
 */
@FeignClient(name = "producer")
public interface ProducerFeignClient {

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    String getInfo();
}
