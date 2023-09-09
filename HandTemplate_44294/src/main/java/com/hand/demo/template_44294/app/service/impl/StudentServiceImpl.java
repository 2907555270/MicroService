package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.StudentService;
import com.hand.demo.template_44294.domain.entity.Student;
import com.hand.demo.template_44294.domain.vo.StudentVo;
import com.hand.demo.template_44294.infra.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:00
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void insertBatch(List<Student> studentList) {
        studentMapper.insertBatch(studentList);
    }

    @Override
    public void updateById(Student student) {
        studentMapper.updateById(student);
    }

    @Override
    public void removeById(Long id) {
        studentMapper.removeById(id);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    /**
     * 获取所有学生的所有课程和成绩信息
     *
     * @return 学生成绩单汇总
     */
    @Override
    public List<StudentVo> queryStuWithCourseAndScore() {
        return studentMapper.selectStuWithCourseAndScore();
    }
}
