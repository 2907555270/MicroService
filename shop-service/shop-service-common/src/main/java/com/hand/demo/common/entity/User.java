package com.hand.demo.common.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * description
 *
 * @author EMP_44294 2023/09/09 11:22
 */
@Table(name = "tb_user")
@Entity
public class User implements Serializable {

    /**
    * 
    */
    @Id
    private Integer id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 年龄
    */
    private Integer age;
    /**
    * 余额
    */
    private BigDecimal balance;
    /**
    * 地址
    */
    private String address;

    /**
    * 
    */
    private void setId(Integer id){
    this.id = id;
    }

    /**
    * 用户名
    */
    private void setUsername(String username){
    this.username = username;
    }

    /**
    * 密码
    */
    private void setPassword(String password){
    this.password = password;
    }

    /**
    * 年龄
    */
    private void setAge(Integer age){
    this.age = age;
    }

    /**
    * 余额
    */
    private void setBalance(BigDecimal balance){
    this.balance = balance;
    }

    /**
    * 地址
    */
    private void setAddress(String address){
    this.address = address;
    }


    /**
    * 
    */
    private Integer getId(){
    return this.id;
    }

    /**
    * 用户名
    */
    private String getUsername(){
    return this.username;
    }

    /**
    * 密码
    */
    private String getPassword(){
    return this.password;
    }

    /**
    * 年龄
    */
    private Integer getAge(){
    return this.age;
    }

    /**
    * 余额
    */
    private BigDecimal getBalance(){
    return this.balance;
    }

    /**
    * 地址
    */
    private String getAddress(){
    return this.address;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                ", address='" + address + '\'' +
                '}';
    }
}
