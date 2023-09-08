package com.hand.demo.template_44294.api.controller.v1.responseBody;

import com.hand.demo.template_44294.app.service.DepartmentsService;
import com.hand.demo.template_44294.domain.vo.DepartmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 19:33
 */
@RestController
@RequestMapping("/dep")
public class DepartmentController {
    @Autowired
    private DepartmentsService departmentsService;

    /**
     * 查询指定部门的所有员工信息
     *
     * @param depId 部门id
     * @return 部门信息和员工信息集合
     */
    @GetMapping("/info/{depId}")
    public Rs getDepWithEmployees(@PathVariable Integer depId) {
        DepartmentVo departmentVo = departmentsService.queryDepartmentWithEmpByDip(depId);
        return Rs.success(null, departmentVo);
    }

}
