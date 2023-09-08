package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Teacher;
import com.hand.demo.template_44294.domain.vo.TeacherVo;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:32
 */
@SpringBootTest
public class TeacherServiceTest {

    @Autowired
    private TeacherService teacherService;

    @Test
    @Ignore
    void testInsertMany() {
        int n = 10;
        ArrayList<Teacher> teachers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Teacher teacher = new Teacher();
            teacher.setName("test_" + i);
            teachers.add(teacher);
        }
        teacherService.insertBatch(teachers);

        // 查看生成的id
        System.out.println(teachers.get(0));
    }

    @Test
    @Ignore
    void testUpdateById() {
        Teacher teacher = new Teacher();
        teacher.setId(2L);
        teacher.setName("test_update");
        teacherService.updateById(teacher);
    }

    @Test
    @Ignore
    void testRemoveById() {
        teacherService.removeById(2L);
    }

    /**
     * 测试查询某个老师对应的课程信息
     */
    @Test
    void testSelectAll() {
        List<Teacher> teachers = teacherService.selectAll();
        System.out.println(teachers);
    }

    @Test
    void testSelectWithCourseByTid(){
        TeacherVo teacherVo = teacherService.selectWithCourseByTid(3L);
        System.out.println(teacherVo);
    }

}
