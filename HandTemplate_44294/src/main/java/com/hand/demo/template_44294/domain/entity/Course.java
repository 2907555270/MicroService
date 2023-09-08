package com.hand.demo.template_44294.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName course
 */
@Data
public class Course implements Serializable {

    private Long id;

    private String name;

    private Long teacherId;

    private static final long serialVersionUID = 1L;
}