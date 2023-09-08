package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.DepartmentsService;
import com.hand.demo.template_44294.domain.vo.DepartmentVo;
import com.hand.demo.template_44294.infra.mapper.DepartmentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
@Service
public class DepartmentsServiceImpl implements DepartmentsService {

    @Autowired
    private DepartmentsMapper departmentsMapper;

    /**
     * 查询指定部门的所有员工信息
     *
     * @param did 部门id
     * @return 部门信息和员工信息集合
     */
    @Override
    public DepartmentVo queryDepartmentWithEmpByDip(Integer did) {
        return departmentsMapper.queryDepartmentWithEmpByDip(did);
    }
}
