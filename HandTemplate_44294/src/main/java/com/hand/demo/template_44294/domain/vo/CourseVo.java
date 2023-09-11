package com.hand.demo.template_44294.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:43
 */
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
     * 分数Id
     */
    private Long gradeId;
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

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Long getGradeId() {
        return gradeId;
    }

    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    @Override
    public String toString() {
        return "CourseVo{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", gradeId=" + gradeId +
                ", score=" + score +
                ", teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
