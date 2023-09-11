package com.hand.demo.order.infra.feign.client;

import com.hand.demo.common.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 16:04
 */
@FeignClient(name = "shop-service-product")
public interface ProductFeignClient {

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    Product findById(@PathVariable("id") Long id);
}
