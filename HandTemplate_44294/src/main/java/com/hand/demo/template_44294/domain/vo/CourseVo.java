package com.hand.demo.template_44294.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:43
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CourseVo implements Serializable {
    /**
     * 课程id
     */
    private Long courseId;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 课程得分
     */
    private BigDecimal score;
    /**
     * 教师id
     */
    private Long teacherId;
    /**
     * 老师名称
     */
    private String teacherName;
}
