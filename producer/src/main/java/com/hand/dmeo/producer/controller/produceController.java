package com.hand.dmeo.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "producer-" + port;
    }
}
