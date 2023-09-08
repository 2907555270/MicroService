package com.hand.demo.template_44294.app.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 个人学习服务层测试类
 *
 * @author EMP_44294 2023/09/07 10:19
 */
@SpringBootTest
public class PersonalVoServiceTest {

    @Autowired
    private PersonalService personalService;

    @Test
    void testUserIOC(){
        personalService.printUser();
        System.out.println("-------------------");
        personalService.printUsers();
    }

}
