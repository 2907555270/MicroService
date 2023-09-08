package com.hand.demo.template_44294.infra.mapper;


import com.hand.demo.template_44294.domain.vo.DepartmentVo;

import java.util.List;

public interface DepartmentsMapper {

    /**
     * 查询指定部门的所有员工信息
     *
     * @param did 部门id
     * @return 部门信息和员工信息集合
     */
    DepartmentVo queryDepartmentWithEmpByDip(Integer did);
}
