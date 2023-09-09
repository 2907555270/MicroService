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
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    /**
    * 
    */
    @Id
    private Integer id;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 商品id
    */
    private Integer productId;
    /**
    * 数量
    */
    private Integer number;
    /**
    * 单价
    */
    private BigDecimal price;
    /**
    * 总额
    */
    private BigDecimal amount;
    /**
    * 商品名
    */
    private String productName;
    /**
    * 用户名
    */
    private String username;

    /**
    * 
    */
    private void setId(Integer id){
    this.id = id;
    }

    /**
    * 用户id
    */
    private void setUserId(Integer userId){
    this.userId = userId;
    }

    /**
    * 商品id
    */
    private void setProductId(Integer productId){
    this.productId = productId;
    }

    /**
    * 数量
    */
    private void setNumber(Integer number){
    this.number = number;
    }

    /**
    * 单价
    */
    private void setPrice(BigDecimal price){
    this.price = price;
    }

    /**
    * 总额
    */
    private void setAmount(BigDecimal amount){
    this.amount = amount;
    }

    /**
    * 商品名
    */
    private void setProductName(String productName){
    this.productName = productName;
    }

    /**
    * 用户名
    */
    private void setUsername(String username){
    this.username = username;
    }


    /**
    * 
    */
    private Integer getId(){
    return this.id;
    }

    /**
    * 用户id
    */
    private Integer getUserId(){
    return this.userId;
    }

    /**
    * 商品id
    */
    private Integer getProductId(){
    return this.productId;
    }

    /**
    * 数量
    */
    private Integer getNumber(){
    return this.number;
    }

    /**
    * 单价
    */
    private BigDecimal getPrice(){
    return this.price;
    }

    /**
    * 总额
    */
    private BigDecimal getAmount(){
    return this.amount;
    }

    /**
    * 商品名
    */
    private String getProductName(){
    return this.productName;
    }

    /**
    * 用户名
    */
    private String getUsername(){
    return this.username;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", number=" + number +
                ", price=" + price +
                ", amount=" + amount +
                ", productName='" + productName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
