package com.hand.demo.order.infra.dao;

import com.hand.demo.common.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 12:26
 */
@Repository
public interface OrderDao extends JpaRepository<Order,Long>, JpaSpecificationExecutor<Order> {

}
