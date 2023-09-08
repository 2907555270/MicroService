package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.TeacherService;
import com.hand.demo.template_44294.domain.entity.Teacher;
import com.hand.demo.template_44294.domain.vo.TeacherVo;
import com.hand.demo.template_44294.infra.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 17:44
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public void insertBatch(List<Teacher> teacherList) {
        teacherMapper.insertBatch(teacherList);
    }

    @Override
    public void updateById(Teacher teacher) {
        teacherMapper.updateById(teacher);
    }

    @Override
    public void removeById(Long id) {
        teacherMapper.removeById(id);
    }

    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    /**
     * 查询某个老师对应的课程信息
     *
     * @param teacherId 教师id
     * @return 教师以及课程信息
     */
    @Override
    public TeacherVo selectWithCourseByTid(Long teacherId) {
        return teacherMapper.selectWithCourseByTid(teacherId);
    }
}
