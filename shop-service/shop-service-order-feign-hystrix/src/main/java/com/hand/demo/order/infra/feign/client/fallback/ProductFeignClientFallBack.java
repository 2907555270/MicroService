package com.hand.demo.order.infra.feign.client.fallback;

import com.hand.demo.common.entity.Product;
import com.hand.demo.order.infra.feign.client.ProductFeignClient;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author EMP_44294 2023/09/10 10:46
 */
@Component
public class ProductFeignClientFallBack implements ProductFeignClient {
    @Override
    public Product findById(Long id) {
        Product product = new Product();
        product.setId(-1L);
        product.setProductDesc("熔断");
        return product;
    }
}
