package com.hand.demo.template_44294.app.service;

/**
 * 个人学习测试层接口
 *
 * @author EMP_44294 2023/09/07 10:14
 */
public interface PersonalService {
    /**
     * 接口的默认方法
     */
    default void printUser() {
        System.out.println("no user");
    }


    /**
     * Bean注入集合
     */
    void printUsers();
}
