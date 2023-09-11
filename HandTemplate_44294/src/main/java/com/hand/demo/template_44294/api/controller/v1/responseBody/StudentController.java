package com.hand.demo.template_44294.api.controller.v1.responseBody;

import com.hand.demo.template_44294.api.controller.v1.dto.StudentCourseDto;
import com.hand.demo.template_44294.app.service.StudentService;
import com.hand.demo.template_44294.domain.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    /**
     * 根据输入查询学生姓名
     *
     * @param name 输入内容
     * @return 匹配到的学生姓名
     */
    @GetMapping("/search/studentName/{name}")
    public Rs searchStudentName(@PathVariable String name) {
        List<String> studentNames = studentService.queryStudentName(name);
        return Rs.success(null, studentNames);
    }

    /**
     * 根据输入查询课程名字
     *
     * @param name 输入内容
     * @return 匹配到的课程名字
     */
    @GetMapping("/search/courseName/{name}")
    public Rs searchCourseName(@PathVariable String name) {
        List<String> courseNames = studentService.queryCourseName(name);
        return Rs.success(null, courseNames);
    }

    /**
     * 按条件查询学生信息
     *
     * @param studentCourseDto 学生查询条件
     * @return 匹配的学生成绩信息
     */
    @PostMapping("/search/info")
    public Rs searchStudentInfo(@RequestBody StudentCourseDto studentCourseDto) {
        List<StudentVo> studentVos = studentService.queryStudentByCondition(studentCourseDto);
        return Rs.success(null, studentVos);
    }
}
