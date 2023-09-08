package com.hand.demo.template_44294.infra.mapper;

import com.hand.demo.template_44294.domain.entity.StudentCourse;

import java.util.List;

/**
* @author EMP
* @description 针对表【StudentCourse_course】的数据库操作Mapper
* @createDate 2023-09-07 17:19:07
* @Entity com.hand.demo.template_44294.domain.entity.StudentCourseCourse
*/
public interface StudentCourseMapper {
    void insertBatch(List<StudentCourse> studentCourseList);

    void updateById(StudentCourse studentCourse);

    void removeById(Long id);

    List<StudentCourse> selectAll();
}




