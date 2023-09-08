package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Grade;
import com.hand.demo.template_44294.domain.entity.Student;
import com.hand.demo.template_44294.domain.vo.StudentVo;
import com.hand.demo.template_44294.domain.vo.TeacherVo;

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
}
