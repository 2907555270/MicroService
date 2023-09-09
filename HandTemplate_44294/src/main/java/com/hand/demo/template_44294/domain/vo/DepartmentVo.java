package com.hand.demo.template_44294.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hand.demo.template_44294.domain.entity.Employee;

import java.io.Serializable;
import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 19:08
 */
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
    private List<Employee> employeeList;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "DepartmentVo{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
