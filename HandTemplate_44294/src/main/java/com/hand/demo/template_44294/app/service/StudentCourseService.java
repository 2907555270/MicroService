package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Grade;
import com.hand.demo.template_44294.domain.entity.StudentCourse;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:04
 */
public interface StudentCourseService {
    void insertBatch(List<StudentCourse> StudentCourseList);

    void updateById(StudentCourse StudentCourse);

    void removeById(Long id);

    List<StudentCourse> selectAll();
}
