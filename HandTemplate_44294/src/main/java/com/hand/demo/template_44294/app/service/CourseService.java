package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Course;
import com.hand.demo.template_44294.domain.vo.CourseVo;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 17:20
 */
public interface CourseService {
    void insertBatch(List<Course> courseList);

    void updateById(Course course);

    void removeById(Long id);

    List<Course> selectAll();

    /**
     * 根据输入查询课程名字
     *
     * @param name 输入内容
     * @return 匹配到的课程名字
     */
    List<String> queryCourseName(String name);

    /**
     * 修改学生成绩信息
     *
     * @param courseVo 成绩信息
     */
    void updateStudentScore(CourseVo courseVo);
}
