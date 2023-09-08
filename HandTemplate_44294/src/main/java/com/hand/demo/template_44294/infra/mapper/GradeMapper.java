package com.hand.demo.template_44294.infra.mapper;

import com.hand.demo.template_44294.domain.entity.Grade;

import java.util.List;

/**
* @author EMP
* @description 针对表【grade】的数据库操作Mapper
* @createDate 2023-09-07 17:19:07
* @Entity com.hand.demo.template_44294.domain.entity.Grade
*/
public interface GradeMapper {
    void insertBatch(List<Grade> gradeList);

    void updateById(Grade grade);

    void removeById(Long id);

    List<Grade> selectAll();
}




