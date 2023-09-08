package com.hand.demo.template_44294.infra.mapper;

import com.hand.demo.template_44294.domain.entity.Teacher;
import com.hand.demo.template_44294.domain.vo.TeacherVo;

import java.util.List;

/**
* @author EMP
* @description 针对表【teacher】的数据库操作Mapper
* @createDate 2023-09-07 17:19:07
* @Entity com.hand.demo.template_44294.domain.entity.Teacher
*/
public interface TeacherMapper {

    void insertBatch(List<Teacher> teacherList);

    void updateById(Teacher teacher);

    void removeById(Long id);

    List<Teacher> selectAll();

    /**
     * 查询某个老师对应的课程信息
     *
     * @param teacherId 教师id
     * @return 教师以及课程信息
     */
    TeacherVo selectWithCourseByTid(Long teacherId);
}




