package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Course;
import com.hand.demo.template_44294.domain.entity.Teacher;
import com.hand.demo.template_44294.domain.vo.TeacherVo;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 17:44
 */
public interface TeacherService {
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
