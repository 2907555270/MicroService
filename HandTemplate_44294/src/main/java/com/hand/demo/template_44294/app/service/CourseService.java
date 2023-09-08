package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Course;

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
}
