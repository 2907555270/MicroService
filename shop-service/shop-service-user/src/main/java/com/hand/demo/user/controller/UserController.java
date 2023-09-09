package com.hand.demo.user.controller;

import com.hand.demo.common.entity.User;
import com.hand.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 12:43
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List findAll() {
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }
    @PostMapping
    public String save(@RequestBody User user) {
        userService.save(user);
        return "保存成功";
    }
    @PutMapping("/{id}")
    public String update(@RequestBody User user) {
        userService.update(user);
        return "修改成功";
    }
    @DeleteMapping("/{id}")
    public String delete(Long id) {
        userService.delete(id);
        return "删除成功";
    }
}
