package com.hand.demo.template_44294.infra.mapper;

import com.hand.demo.template_44294.domain.entity.Student;
import com.hand.demo.template_44294.domain.vo.StudentVo;

import java.util.List;

/**
* @author EMP
* @description 针对表【student】的数据库操作Mapper
* @createDate 2023-09-07 17:19:07
* @Entity com.hand.demo.template_44294.domain.entity.Student
*/
public interface StudentMapper {
    void insertBatch(List<Student> studentList);

    void updateById(Student student);

    void removeById(Long id);

    List<Student> selectAll();

    /**
     * 获取所有学生的所有课程和成绩信息
     *
     * @return 学生成绩单汇总
     */
    List<StudentVo> selectStuWithCourseAndScore();
}




