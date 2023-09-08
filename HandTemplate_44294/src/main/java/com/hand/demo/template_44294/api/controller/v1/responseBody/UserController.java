package com.hand.demo.template_44294.api.controller.v1.responseBody;

import com.hand.demo.template_44294.domain.exception.CustomerException;
import com.hand.demo.template_44294.app.service.UserService;
import com.hand.demo.template_44294.api.controller.v1.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户接口控制层
 *
 * @author EMP_44294 2023/09/07 11:04
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户id*100
     *
     * @param id userId
     * @return 转换后的id
     */
    @GetMapping("/{id}")
    public Long computeId(@PathVariable Long id) {
        return id * 100;
    }

    /**
     * 转换用户信息的输出格式
     *
     * @param userDto 用户信息
     * @return 格式化后的字符串
     */
    @PostMapping
    public Rs convertFormat(@RequestBody UserDto userDto) {
        return Rs.success(null, userService.convertBasicInfo(userDto));
    }

    /**
     * 判断用户是否成年，并返回用户信息
     *
     * @param userDto 用户信息
     * @return 转换后的用户信息
     */
    @PutMapping
    public Rs isAdult(@RequestBody UserDto userDto) throws CustomerException {
        return Rs.success(null, userService.convertIsAdult(userDto));
    }

    /**
     * 删除用户信息
     *
     * @param userDto 用户信息（包含name字段）
     * @return 删除反馈
     */
    @DeleteMapping
    public Rs removeUser(@RequestBody UserDto userDto) throws CustomerException {
        userService.removeUserByName(userDto);

        return Rs.success(userDto.getName() + " 信息已删除", null);
    }

}
