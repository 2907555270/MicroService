package com.hand.demo.template_44294.api.controller.v1.responseBody;

import com.hand.demo.template_44294.app.service.GradeService;
import com.hand.demo.template_44294.domain.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author EMP_44294 2023/09/11 9:20
 */
@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    /**
     * 修改成绩
     * @param grade 成绩信息
     * @return 修改结果
     */
    @PutMapping
    public Rs updateScoreByGid(@RequestBody Grade grade) {
        gradeService.updateById(grade);
        return Rs.success("修改成功", null);
    }
}
