package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.api.controller.v1.dto.StudentCourseDto;
import com.hand.demo.template_44294.domain.entity.Student;
import com.hand.demo.template_44294.domain.vo.StudentVo;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 17:59
 */
public interface StudentService {
    void insertBatch(List<Student> studentList);

    void updateById(Student student);

    void removeById(Long id);

    List<Student> selectAll();


    /**
     * 获取所有学生的所有课程和成绩信息
     *
     * @return 学生成绩单汇总
     */
    List<StudentVo> queryStuWithCourseAndScore();

    /**
     * 根据输入查询学生姓名
     *
     * @param name 输入内容
     * @return 匹配到的学生姓名
     */
    List<String> queryStudentName(String name);

    /**
     * 根据输入查询课程名字
     *
     * @param name 输入内容
     * @return 匹配到的课程名字
     */
    List<String> queryCourseName(String name);

    /**
     * 按条件查询学生信息
     *
     * @param studentCourseDto 学生查询条件
     * @return 匹配的学生成绩信息
     */
    List<StudentVo> queryStudentByCondition(StudentCourseDto studentCourseDto);

}
