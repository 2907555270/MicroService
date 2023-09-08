package com.hand.demo.template_44294.api.controller.v1.responseBody;

import com.hand.demo.template_44294.app.service.TeacherService;
import com.hand.demo.template_44294.domain.vo.TeacherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 19:05
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    /**
     * 查询某个老师对应的课程信息
     *
     * @param tid 教师id
     * @return 教师以及课程信息
     */
    @GetMapping("/info/{tid}")
    public Rs selectWithCourseByTid(@PathVariable Long tid) {
        TeacherVo teacherVo = teacherService.selectWithCourseByTid(tid);
        return Rs.success(null, teacherVo);
    }


}
