package com.hand.demo.template_44294.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hand.demo.template_44294.domain.entity.Course;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:41
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentVo implements Serializable {
    /**
     * 学生id
     */
    private Long studentId;
    /**
     * 学生名称
     */
    private String studentName;
    /**
     * 学生所学课程
     */
    private List<CourseVo> courseVos;
}
