package com.hand.dmeo.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * description
 *
 * @author EMP_44294 2023/09/08 15:42
 */
@RestController
public class produceController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/info")
    public String info() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("测试休眠");
        }
        return "producer-" + port;
    }
}
