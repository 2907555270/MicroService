package com.hand.demo.customer.infra.feign.client;

import com.hand.demo.customer.infra.feign.client.impl.ProducerFeignClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 14:21
 */
@FeignClient(name = "producer",fallback = ProducerFeignClientImpl.class)
public interface ProducerFeignClient {

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    String getInfo();

    @RequestMapping(value = "/hystrix/ok/{id}")
    String getOk(@PathVariable Integer id);

    @RequestMapping(value = "/hystrix/timeout/{id}")
    String getTimeout(@PathVariable Integer id);
}
