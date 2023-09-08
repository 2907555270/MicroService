package com.hand.demo.template_44294.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName teacher
 */
@Data
public class Teacher implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    private static final long serialVersionUID = 1L;
}