package com.hand.dmeo.producer.service;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 15:13
 */
public interface HystrixService {

    String deptInfoOk(Integer id);

    String deptInfoTimeout(Integer id);
}
