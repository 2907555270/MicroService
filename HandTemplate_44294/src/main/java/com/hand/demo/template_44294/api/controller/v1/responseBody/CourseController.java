package com.hand.demo.template_44294.api.controller.v1.responseBody;

import com.hand.demo.template_44294.app.service.CourseService;
import com.hand.demo.template_44294.domain.vo.CourseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 7:38
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    /**
     * 根据输入查询课程名字
     *
     * @param name 输入内容
     * @return 匹配到的课程名字
     */
    @GetMapping("/search/courseName/{name}")
    public Rs searchCourseName(@PathVariable String name) {
        List<String> courseNames = courseService.queryCourseName(name);
        return Rs.success(null, courseNames);
    }

    /**
     * 修改学生成绩信息
     *
     * @param courseVo 成绩信息
     */
    @PutMapping("/score")
    public Rs updateStudentScore(@RequestBody CourseVo courseVo) {
        courseService.updateStudentScore(courseVo);
        return Rs.success(null, null);
    }
}
