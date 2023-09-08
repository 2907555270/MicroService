package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.GradeService;
import com.hand.demo.template_44294.domain.entity.Grade;
import com.hand.demo.template_44294.domain.entity.Teacher;
import com.hand.demo.template_44294.infra.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 17:57
 */
@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public void insertBatch(List<Grade> gradeList) {
        gradeMapper.insertBatch(gradeList);
    }

    @Override
    public void updateById(Grade grade) {
        gradeMapper.updateById(grade);
    }

    @Override
    public void removeById(Long id) {
        gradeMapper.removeById(id);
    }

    @Override
    public List<Grade> selectAll() {
        return gradeMapper.selectAll();
    }
}
