package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.api.controller.v1.dto.StudentCourseDto;
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

    /**
     * 根据输入查询学生姓名
     *
     * @param name 输入内容
     * @return 匹配到的学生姓名
     */
    @Override
    public List<String> queryStudentName(String name) {
        return studentMapper.selectStudentNameByName(name);
    }

    /**
     * 根据输入查询课程名字
     *
     * @param name 输入内容
     * @return 匹配到的课程名字
     */
    @Override
    public List<String> queryCourseName(String name) {
        return studentMapper.selectCourseNameByName(name);
    }

    /**
     * 按条件查询学生信息
     *
     * @param studentCourseDto 学生查询条件
     * @return 匹配的学生成绩信息
     */
    @Override
    public List<StudentVo> queryStudentByCondition(StudentCourseDto studentCourseDto) {
        return studentMapper.selectStuInfoByCondition(studentCourseDto);
    }
}
