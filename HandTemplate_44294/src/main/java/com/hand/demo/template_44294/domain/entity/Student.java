package com.hand.demo.template_44294.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @TableName student
 */
@Data
public class Student implements Serializable {
    private Long id;
    private String name;

    private static final long serialVersionUID = 1L;
}