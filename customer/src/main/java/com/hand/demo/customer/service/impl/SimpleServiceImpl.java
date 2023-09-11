package com.hand.demo.customer.service.impl;

import com.hand.demo.customer.service.SimpleService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 16:55
 */
@Service
public class SimpleServiceImpl implements SimpleService {

    @HystrixCommand(fallbackMethod = "circuitBreakerFallback", commandProperties = {
            //以下参数在 HystrixCommandProperties 类中有默认配置
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), //是否开启熔断器
            @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds",value = "2000"), //统计时间窗
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "4"), //统计时间窗内请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //休眠时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"), //在统计时间窗口期以内，请求失败率达到 60% 时进入熔断状态
    })
    @Override
    public String findId(Integer id) {
        if (id < 1) {
            throw new RuntimeException("id < 1");
        }
        String serialNum = UUID.randomUUID().toString();
        return Thread.currentThread().getName() + "\t" + "调用成功，流水号为：" + serialNum;
    }

    public String circuitBreakerFallback(Integer id){
        return "getTimeout熔断降级";
    }
}
