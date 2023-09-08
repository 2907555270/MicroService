package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.PersonalService;
import com.hand.demo.template_44294.domain.vo.PersonalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 个人学习测试层实现类
 *
 * @author EMP_444294 2023/09/07 10:14
 */
@Service
public class PersonalServiceImpl implements PersonalService {

    // @Autowired
    // @Qualifier("user_1")
    // private User user_1;
    //
    // @Autowired
    // @Qualifier("user_2")
    // private User user_2;

    /**
     * Bean注入到集合中
     */
    @Autowired
    private List<PersonalVo> personalVoList;

    /**
     * 默认方法不强制要求实现，默认
     */
    @Override
    public void printUser() {
        PersonalService.super.printUser();
    }

    @Override
    public void printUsers() {
        personalVoList.forEach(System.out::println);
    }
}
