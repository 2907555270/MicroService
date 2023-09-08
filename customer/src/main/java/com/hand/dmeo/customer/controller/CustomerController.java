package com.hand.dmeo.customer.controller;

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

    @GetMapping("/info")
    public String getProducerInfo(){
        return restTemplate.getForObject("http://producer/info",String.class);
    }
}
