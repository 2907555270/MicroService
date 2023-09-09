package com.hand.demo.template_44294.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 18:55
 */
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

    @Override
    public String toString() {
        return "TeacherVo{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
