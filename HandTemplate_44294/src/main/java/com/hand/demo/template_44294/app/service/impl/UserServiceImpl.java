package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.domain.exception.CustomerException;
import com.hand.demo.template_44294.app.service.UserService;
import com.hand.demo.template_44294.api.controller.v1.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * 用户服务层实现类
 *
 * @author EMP_44294 2023/09/07 11:11
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * 转换用户的信息格式
     *
     * @param userDto 用户信息
     * @return 字符串格式的用户信息
     */
    public String convertBasicInfo(UserDto userDto) {
        return userDto.getName() + "," + userDto.getSex() + "性," + userDto.getAge() + "周岁";
    }

    /**
     * 识别并修改用户的成年状态
     *
     * @param userDto 用户信息
     * @return 修改后的用户信息
     */
    public UserDto convertIsAdult(UserDto userDto) throws CustomerException {
        if (Objects.isNull(userDto.getAge())) {
            throw new CustomerException("age属性缺失，判断失败");
        }
        userDto.setMark(userDto.getAge() >= 18 ? "已成年" : "未成年");
        return userDto;
    }

    /**
     * 根据用户name删除用户
     *
     * @param userDto 包含name的用户信息
     */
    @Override
    public void removeUserByName(UserDto userDto) throws CustomerException {
        // 执行删除，如果删除失败，抛出异常，交给全局异常处理器
        if (Objects.isNull(userDto.getName())) {
            throw new CustomerException("name属性缺失，删除失败");
        }
    }
}
