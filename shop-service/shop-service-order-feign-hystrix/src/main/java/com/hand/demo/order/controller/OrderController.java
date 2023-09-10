package com.hand.demo.order.controller;

import com.hand.demo.common.entity.Product;
import com.hand.demo.order.infra.feign.client.ProductFeignClient;
import com.hand.demo.order.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 12:26
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductFeignClient productFeignClient;

    @GetMapping("/product/{id}")
    public Product order(@PathVariable Integer id) {
        return productFeignClient.findById(id);
    }

    // @GetMapping("/{id}")
    // public String order(@PathVariable Integer id) {
    //     Product product = restTemplate.getForObject("http://shop-service-product/product/"+id, Product.class);
    //     System.out.println(product);
    //     assert product != null;
    //     return product.getProductDesc();
    // }

    // @GetMapping
    // public List findAll() {
    //     return orderService.findAll();
    // }
    //
    // @GetMapping("/{id}")
    // public Order findById(@PathVariable Long id) {
    //     return orderService.findById(id);
    // }
    //
    // @PostMapping
    // public String save(@RequestBody Order order) {
    //     orderService.save(order);
    //     return "保存成功";
    // }
    //
    // @PutMapping("/{id}")
    // public String update(@RequestBody Order order) {
    //     orderService.update(order);
    //     return "修改成功";
    // }
    //
    // @DeleteMapping("/{id}")
    // public String delete(Long id) {
    //     orderService.delete(id);
    //     return "删除成功";
    // }

}
