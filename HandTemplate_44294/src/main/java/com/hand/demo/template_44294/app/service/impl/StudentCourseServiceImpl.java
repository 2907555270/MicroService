package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.StudentCourseService;
import com.hand.demo.template_44294.app.service.StudentService;
import com.hand.demo.template_44294.domain.entity.Grade;
import com.hand.demo.template_44294.domain.entity.StudentCourse;
import com.hand.demo.template_44294.infra.mapper.StudentCourseMapper;
import com.hand.demo.template_44294.infra.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:04
 */
@Service
public class StudentCourseServiceImpl implements StudentCourseService {

    @Autowired
    private StudentCourseMapper studentCourseMapper;

    @Override
    public void insertBatch(List<StudentCourse> studentCourseList) {
        studentCourseMapper.insertBatch(studentCourseList);
    }

    @Override
    public void updateById(StudentCourse studentCourse) {
        studentCourseMapper.updateById(studentCourse);
    }

    @Override
    public void removeById(Long id) {
        studentCourseMapper.removeById(id);
    }

    @Override
    public List<StudentCourse> selectAll() {
        return studentCourseMapper.selectAll();
    }
}
