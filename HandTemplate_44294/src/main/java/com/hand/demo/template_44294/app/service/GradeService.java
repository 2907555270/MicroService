package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Grade;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 17:56
 */
public interface GradeService {
    void insertBatch(List<Grade> gradeList);

    void updateById(Grade grade);

    void removeById(Long id);

    List<Grade> selectAll();
}
