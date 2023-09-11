package com.hand.demo.customer.controller;

import com.hand.demo.customer.feign.client.ProducerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description
 *
 * @author EMP_44294 2023/09/08 15:48
 */
@RestController
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProducerFeignClient producerFeignClient;

    @GetMapping("/info")
    public String getProducerInfo(){
        return restTemplate.getForObject("http://producer"+"/info",String.class);
    }

    @GetMapping("feign/info")
    public String getProducerInfoByFeign(){
        return producerFeignClient.getInfo();
    }
}
