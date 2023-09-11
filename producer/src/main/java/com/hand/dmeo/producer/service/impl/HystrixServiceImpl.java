package com.hand.dmeo.producer.service.impl;

import com.hand.dmeo.producer.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 15:14
 */
@Service
public class HystrixServiceImpl implements HystrixService {

    @Override
    public String deptInfoOk(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println("测试超时异常");
        }
        return Thread.currentThread().getName() + ":" + id;
    }

    @HystrixCommand(fallbackMethod = "timeoutFallBack", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    @Override
    public String deptInfoTimeout(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Thread.currentThread().getName() + ":" + id;
    }

    public String timeoutFallBack(Integer id) {
        return "timeout fallback:" + id;
    }
}
