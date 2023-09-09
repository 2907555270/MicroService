package com.hand.demo.user.service;

import com.hand.demo.common.entity.User;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 12:31
 */
public interface UserService {
    //根据id查询
    User findById(Long id);
    //查询全部
    List<User> findAll();
    //保存
    void save(User user);
    //更新
    void update(User user);
    //删除
    void delete(Long id);
}
