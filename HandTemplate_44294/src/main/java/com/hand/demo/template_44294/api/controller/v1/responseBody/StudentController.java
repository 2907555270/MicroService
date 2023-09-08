package com.hand.demo.template_44294.api.controller.v1.responseBody;

import com.hand.demo.template_44294.app.service.StudentService;
import com.hand.demo.template_44294.domain.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:10
 */
@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public Rs listAll() {
        return Rs.success(null, studentService.selectAll());
    }

    /**
     * 查询所有的学生的成绩单信息
     *
     * @return 所选课程 + 分数 的集合
     */
    @GetMapping("/list/info")
    public Rs listAllInfo() {
        List<StudentVo> studentVos = studentService.queryStuWithCourseAndScore();
        return Rs.success(null, studentVos);
    }
}
