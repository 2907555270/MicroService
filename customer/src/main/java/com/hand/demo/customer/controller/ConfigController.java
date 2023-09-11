package com.hand.demo.customer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 20:07
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {
    @Value("${config.name}")
    private String name;

    @Value("${config.info}")
    private String info;

    @Value("${config.version}")
    private String version;


    @GetMapping
    public String getConfigInfo() {
        return "name:" + name + "\ninfo:" + info + "\nversion:" + version;
    }

}
