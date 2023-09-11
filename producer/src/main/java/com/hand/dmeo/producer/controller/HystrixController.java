package com.hand.dmeo.producer.controller;

import com.hand.dmeo.producer.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 15:17
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/ok/{id}")
    public String ok(@PathVariable Integer id) {
        return hystrixService.deptInfoOk(id);
    }

    @GetMapping("/timeout/{id}")
    public String timeOut(@PathVariable Integer id) {
        return hystrixService.deptInfoTimeout(id);
    }

}
