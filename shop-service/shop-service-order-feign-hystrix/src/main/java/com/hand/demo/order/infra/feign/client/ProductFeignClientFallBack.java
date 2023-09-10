package com.hand.demo.order.infra.feign.client;

import com.hand.demo.common.entity.Product;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author EMP_44294 2023/09/10 9:37
 */
@Component(value = "productFeignConfig")
public class ProductFeignClientFallBack implements ProductFeignClient {

    @Override
    public Product findById(Integer id) {
        Product product = new Product();
        product.setId(-1L);
        product.setProductName("熔断");
        return product;
    }
}
