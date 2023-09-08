package com.hand.demo.template_44294.domain.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employees implements Serializable {
    private Integer employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Date hireDate;

    private String jobId;

    private BigDecimal salary;

    private BigDecimal commissionPct;

    private Integer managerId;

    private Integer departmentId;

    private static final long serialVersionUID = 1L;
}