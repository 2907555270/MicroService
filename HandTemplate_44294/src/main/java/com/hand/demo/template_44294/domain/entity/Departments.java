package com.hand.demo.template_44294.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
@Data
public class Departments implements Serializable {
    private Integer departmentId;

    private String departmentName;

    private Integer managerId;

    private Integer locationId;

    private static final long serialVersionUID = 1L;
}