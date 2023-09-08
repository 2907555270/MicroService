package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Student;
import com.hand.demo.template_44294.domain.vo.StudentVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Student类增删改查完成
 *
 * @author EMP_44294 2023/09/07 17:32
 */
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    void testInsertMany(){
        int n = 10;
        ArrayList<Student> students = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.setName("test_"+i);
            students.add(student);
        }
        studentService.insertBatch(students);

        // 查看生成的id
        System.out.println(students.get(0));
    }

    @Test
    void testUpdateById(){
        Student student = new Student();
        student.setId(2L);
        student.setName("test_update");
        studentService.updateById(student);
    }

    @Test
    void testRemoveById(){
        studentService.removeById(2L);
    }

    @Test
    void testSelectAll(){
        List<Student> students = studentService.selectAll();
        System.out.println(students);
    }

    @Test
    void testQueryStuWithCourseAndScore(){
        List<StudentVo> studentVos = studentService.queryStuWithCourseAndScore();
        studentVos.forEach(System.out::println);
    }
}
