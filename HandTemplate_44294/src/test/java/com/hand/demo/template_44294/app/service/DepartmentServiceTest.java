package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.vo.DepartmentVo;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 19:18
 */
@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
    private DepartmentsService departmentsService;

    @Test
    void testSelectDepWithEmpByDid(){
        DepartmentVo departmentVo = departmentsService.queryDepartmentWithEmpByDip(30);
        System.out.println(departmentVo);
    }
}
