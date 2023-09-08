package com.hand.demo.template_44294.api.controller.v1.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户信息
 *
 * @author EMP_44294 2023/09/07 11:07
 */
@Getter
@Setter
public class UserDto {
    private String name;
    private Integer age;
    private String sex;
    private String mark;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
