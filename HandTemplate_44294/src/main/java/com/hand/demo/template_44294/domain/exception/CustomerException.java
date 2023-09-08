package com.hand.demo.template_44294.domain.exception;

/**
 * 运行时手动抛出的异常————业务逻辑异常
 *
 * @author EMP_44294 2023/09/07 11:39
 */
public class CustomerException extends Exception {
    public CustomerException(String message) {
        super(message);
    }
}
