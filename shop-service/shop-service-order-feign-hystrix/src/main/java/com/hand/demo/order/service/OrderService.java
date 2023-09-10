package com.hand.demo.order.service;

import com.hand.demo.common.entity.Order;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 12:38
 */
public interface OrderService {
    //根据id查询
    Order findById(Long id);
    //查询全部
    List<Order> findAll();
    //保存
    void save(Order order);
    //更新
    void update(Order order);
    //删除
    void delete(Long id);
}
