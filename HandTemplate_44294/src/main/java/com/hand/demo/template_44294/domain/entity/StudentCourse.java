package com.hand.demo.template_44294.domain.entity;

import java.io.Serializable;

/**
 * 
 * @TableName student_course
 */
public class StudentCourse implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long studentId;

    /**
     * 
     */
    private Long courseId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                '}';
    }
}