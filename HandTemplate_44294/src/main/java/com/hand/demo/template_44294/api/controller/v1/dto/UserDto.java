package com.hand.demo.template_44294.api.controller.v1.dto;
/**
 * 用户信息
 *
 * @author EMP_44294 2023/09/07 11:07
 */

public class UserDto {
    private String name;
    private Integer age;
    private String sex;
    private String mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

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
