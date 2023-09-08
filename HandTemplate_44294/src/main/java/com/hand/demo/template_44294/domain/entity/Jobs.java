package com.hand.demo.template_44294.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
@Data
public class Jobs implements Serializable {
    private String jobId;

    private String jobTitle;

    private Integer minSalary;

    private Integer maxSalary;

    private static final long serialVersionUID = 1L;
}