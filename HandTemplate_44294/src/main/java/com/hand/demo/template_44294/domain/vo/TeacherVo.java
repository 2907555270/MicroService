package com.hand.demo.template_44294.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:55
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TeacherVo implements Serializable {
    /**
     * 教师id
     */
    private Long teacherId;
    /**
     * 教师名字
     */
    private String teacherName;
    /**
     * 教师课程id
     */
    private Long courseId;
    /**
     * 教师课程名字
     */
    private String courseName;

}
