package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Course;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Course类增删改查完成
 *
 * @author EMP_44294 2023/09/07 17:32
 */
@SpringBootTest
public class CourseServiceTest {

    @Autowired
    private CourseService courseService;

    @Test
    @Ignore
    void testInsertMany(){
        int n = 10;
        ArrayList<Course> courses = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Course course = new Course();
            course.setName("test_"+i);
            course.setTeacherId((long) i);
            courses.add(course);
        }
        courseService.insertBatch(courses);

        // 查看生成的id
        System.out.println(courses.get(0));
    }

    @Test
    @Ignore
    void testUpdateById(){
        Course course = new Course();
        course.setId(1L);
        course.setTeacherId(11L);
        courseService.updateById(course);
    }

    @Test
    @Ignore
    void testRemoveById(){
        courseService.removeById(1L);
    }

    @Test
    void testSelectAll(){
        List<Course> courses = courseService.selectAll();
        System.out.println(courses);
    }
}
