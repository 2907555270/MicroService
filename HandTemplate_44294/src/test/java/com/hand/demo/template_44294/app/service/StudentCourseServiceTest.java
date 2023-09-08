package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.StudentCourse;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:22
 */
@SpringBootTest
public class StudentCourseServiceTest {

    @Autowired
    private StudentCourseService studentCourseService;

    @Test
    @Ignore
    void testInsertMany() {
        int n = 10;
        ArrayList<StudentCourse> studentCourses = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            StudentCourse studentCourse = new StudentCourse();
            studentCourse.setStudentId((long) i % 3);
            studentCourse.setStudentId((long) i % 3);
            studentCourses.add(studentCourse);
        }
        studentCourseService.insertBatch(studentCourses);

        // 查看生成的id
        System.out.println(studentCourses.get(0));
    }

    @Test
    @Ignore
    void testUpdateById() {
        StudentCourse student = new StudentCourse();
        student.setId(2L);
        student.setStudentId(3L);
        studentCourseService.updateById(student);
    }

    @Test
    @Ignore
    void testRemoveById() {
        studentCourseService.removeById(2L);
    }

    @Test
    void testSelectAll() {
        List<StudentCourse> studentCourses = studentCourseService.selectAll();
        System.out.println(studentCourses);
    }

}
