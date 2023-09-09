package com.hand.demo.product.service;

import com.hand.demo.common.entity.Product;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 11:27
 */
public interface ProductService {
    //根据id查询
    Product findById(Long id);
    //查询全部
    List<Product> findAll();
    //保存
    void save(Product product);
    //更新
    void update(Product product);
    //删除
    void delete(Long id);
}
