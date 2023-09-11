package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.CourseService;
import com.hand.demo.template_44294.domain.entity.Course;
import com.hand.demo.template_44294.domain.vo.CourseVo;
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

    /**
     * 根据输入查询课程名字
     *
     * @param name 输入内容
     * @return 匹配到的课程名字
     */
    @Override
    public List<String> queryCourseName(String name) {
        return courseMapper.selectCourseName(name);
    }

    /**
     * 修改学生成绩信息
     *
     * @param courseVo 成绩信息
     */
    @Override
    public void updateStudentScore(CourseVo courseVo) {
        courseMapper.updateByCourseScore(courseVo);
    }
}
