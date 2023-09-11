package com.hand.demo.template_44294.infra.mapper;

import com.hand.demo.template_44294.domain.entity.Course;
import com.hand.demo.template_44294.domain.vo.CourseVo;

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

    /**
     * 根据输入查询课程名字
     *
     * @param name 输入内容
     * @return 匹配到的课程名字
     */
    List<String> selectCourseName(String name);

    /**
     * 修改学生成绩信息
     *
     * @param courseVo 成绩信息
     */
    void updateByCourseScore(CourseVo courseVo);
}




