package com.hand.demo.order.infra.feign.client;

import com.hand.demo.common.entity.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * description
 *
 * TODO:默认熔断不生效
 * @author EMP_44294 2023/09/09 16:04
 */
@FeignClient(name = "shop-service-product",fallback = ProductFeignClientFallBack.class)
public interface ProductFeignClient {

    @HystrixCommand(fallbackMethod = "findById")
    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    Product findById(@PathVariable("id") Integer id);
}
