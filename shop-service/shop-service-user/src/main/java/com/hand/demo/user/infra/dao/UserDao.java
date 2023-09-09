package com.hand.demo.user.infra.dao;

import com.hand.demo.common.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 12:33
 */
@Repository
public interface UserDao extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {

}
