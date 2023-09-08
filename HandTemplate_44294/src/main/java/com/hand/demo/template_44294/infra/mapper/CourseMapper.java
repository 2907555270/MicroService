package com.hand.demo.template_44294.infra.mapper;

import com.hand.demo.template_44294.domain.entity.Course;

import java.util.List;

/**
* @author EMP
* @description 针对表【course】的数据库操作Mapper
* @createDate 2023-09-07 17:19:07
* @Entity com.hand.demo.template_44294.domain.entity.Course
*/
public interface CourseMapper {
    void insertBatch(List<Course> courseList);

    void updateById(Course course);

    void removeById(Long id);

    List<Course> selectAll();
}




