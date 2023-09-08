package com.hand.demo.template_44294.domain.vo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 个人学习实体类
 *
 * @author EMP_44294 2023/09/07 9:57
 */
@Component
public class PersonalVo {
    private String name;
    private Integer age;

    public PersonalVo() {
        this.name = "default";
    }

    public PersonalVo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Bean("p1")
    @Primary
    @Order(1)
    public PersonalVo personalVo1(){
        return new PersonalVo("p1",10);
    }
    @Bean
    @Qualifier("p2")
    @Order(2)
    public PersonalVo personalVo2(){
        return new PersonalVo("p2",20);
    }


    @PostConstruct
    public void init() {
        System.out.println("init bean:"+name);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy bean:"+name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
