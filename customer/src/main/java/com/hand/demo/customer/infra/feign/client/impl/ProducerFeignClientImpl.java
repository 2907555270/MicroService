package com.hand.demo.customer.infra.feign.client.impl;

import com.hand.demo.customer.infra.feign.client.ProducerFeignClient;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 15:52
 */
@Component
public class ProducerFeignClientImpl implements ProducerFeignClient {

    @Override
    public String getInfo() {
        return "getInfo fallback -- customer";
    }

    @Override
    public String getOk(Integer id) {
        return "getOk fallback -- customer";
    }

    @Override
    public String getTimeout(Integer id) {
        return "getTimeout fallback -- customer";
    }

}
