package com.hand.demo.customer.controller;

import com.hand.demo.customer.infra.feign.client.ProducerFeignClient;
import com.hand.demo.customer.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description
 *
 * @author EMP_44294 2023/09/08 15:48
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProducerFeignClient producerFeignClient;

    @Autowired
    private SimpleService simpleService;

    @GetMapping("/info")
    public String getProducerInfo(){
        return restTemplate.getForObject("http://producer"+"/info",String.class);
    }

    @GetMapping("/feign/info")
    public String getProducerInfoByFeign(){
        return producerFeignClient.getInfo();
    }

    @GetMapping("/hystrix/ok/{id}")
    public String getOk(@PathVariable Integer id){
        return producerFeignClient.getOk(id);
    }

    // @HystrixCommand(fallbackMethod = "timeoutHandler")
    @GetMapping("/hystrix/timeout/{id}")
    public String getTimeout(@PathVariable Integer id){
        return producerFeignClient.getTimeout(id);
    }

    @GetMapping("/cir/{id}")
    public String circuitBreaker(@PathVariable Integer id){
        return simpleService.findId(id);
    }

    @PostMapping("/gateway/test")
    public String gatewayTest(){
        return "gateway Success";
    }
    // public String timeoutHandler(@PathVariable("id") Integer id) {
    //     return "C语言中文网提醒您：服务端系统繁忙，请稍后再试！（客户端 deptInfo_Timeout 专属的回退方法触发）";
    // }
}
