package com.hand.demo.template_44294.domain.entity;

import java.io.Serializable;

/**
 * 
 * @TableName teacher
 */
public class Teacher implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}