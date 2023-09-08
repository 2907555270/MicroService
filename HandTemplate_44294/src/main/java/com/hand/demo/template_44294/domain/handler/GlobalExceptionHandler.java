package com.hand.demo.template_44294.domain.handler;

import com.hand.demo.template_44294.api.controller.v1.responseBody.Rs;
import com.hand.demo.template_44294.domain.exception.CustomerException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author EMP_44294 2023/09/07 11:26
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 自定义业务异常
     *
     * @param e 异常对象
     * @return Rs
     */
    @ExceptionHandler(CustomerException.class)
    @Order(0)
    public Rs customerException(CustomerException e) {
        log.error("自定义异常:" + e.getMessage());
        return Rs.success(e.getMessage(), null);
    }

    /**
     * 默认未处理的异常
     *
     * @param e 异常对象
     * @return Rs
     */
    @ExceptionHandler(RuntimeException.class)
    @Order(1)
    public Rs exceptionHandler(RuntimeException e) {
        log.error("内部异常:" + e.getMessage());
        e.printStackTrace();
        return Rs.error("内部异常:" + e.getMessage());
    }
}
