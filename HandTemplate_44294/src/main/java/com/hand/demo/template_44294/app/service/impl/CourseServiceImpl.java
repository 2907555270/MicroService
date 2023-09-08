package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.CourseService;
import com.hand.demo.template_44294.domain.entity.Course;
import com.hand.demo.template_44294.infra.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 17:22
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public void insertBatch(List<Course> courseList) {
        courseMapper.insertBatch(courseList);
    }

    @Override
    public void updateById(Course course) {
        courseMapper.updateById(course);
    }

    @Override
    public void removeById(Long id) {
        courseMapper.removeById(id);
    }

    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }
}
