package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.exception.CustomerException;
import com.hand.demo.template_44294.api.controller.v1.dto.UserDto;

/**
 * 用户信息服务层接口
 *
 * @author EMP_44294 2023/09/07 11:11
 */
public interface UserService {
    /**
     * 转换用户的信息格式
     *
     * @param userDto 用户信息
     * @return 字符串格式的用户信息
     */
    String convertBasicInfo(UserDto userDto);

    /**
     * 识别并修改用户的成年状态
     *
     * @param userDto 用户信息
     * @return 修改后的用户信息
     */
    UserDto convertIsAdult(UserDto userDto) throws CustomerException;

    /**
     * 根据用户name删除用户
     * @param userDto 包含name的用户信息
     */
    void removeUserByName(UserDto userDto) throws CustomerException;
}
