package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.vo.DepartmentVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 19:18
 */
@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @Test
    void testSelectDepWithEmpByDid(){
        DepartmentVo departmentVo = departmentService.queryDepartmentWithEmpByDip(30);
        System.out.println(departmentVo);
    }
}
