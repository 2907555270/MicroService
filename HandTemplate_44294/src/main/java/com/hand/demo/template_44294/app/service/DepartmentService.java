package com.hand.demo.template_44294.app.service;


import com.hand.demo.template_44294.domain.vo.DepartmentVo;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
public interface DepartmentService {
    /**
     * 查询指定部门的所有员工信息
     *
     * @param did 部门id
     * @return 部门信息和员工信息集合
     */
    DepartmentVo queryDepartmentWithEmpByDip(Integer did);
}
