package com.hand.demo.template_44294.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hand.demo.template_44294.domain.entity.Employees;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 19:08
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DepartmentVo implements Serializable {
    /**
     * 部门id
     */
    private Integer departmentId;

    /**
     * 部门名称
     */
    private String departmentName;

    /**
     * 员工集合
     */
    private List<Employees> employeesList;
}
