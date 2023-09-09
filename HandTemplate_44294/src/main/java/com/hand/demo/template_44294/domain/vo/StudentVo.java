package com.hand.demo.template_44294.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:41
 */
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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<CourseVo> getCourseVos() {
        return courseVos;
    }

    public void setCourseVos(List<CourseVo> courseVos) {
        this.courseVos = courseVos;
    }

    @Override
    public String toString() {
        return "StudentVo{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", courseVos=" + courseVos +
                '}';
    }
}
