package com.hand.demo.template_44294.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName grade
 */
@Data
public class Grade implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long studentId;

    /**
     * 
     */
    private Long courseId;

    /**
     * 
     */
    private BigDecimal score;

    private static final long serialVersionUID = 1L;
}