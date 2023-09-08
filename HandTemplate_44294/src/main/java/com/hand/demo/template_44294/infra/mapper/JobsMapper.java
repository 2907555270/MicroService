package com.hand.demo.template_44294.infra.mapper;


import com.hand.demo.template_44294.domain.entity.Jobs;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
public interface JobsMapper {
    /**
     * 查询所有的Job
     *
     * @return jobs集合
     */
    List<Jobs> selectAllJobs();

    /**
     * 动态SQL:条件查询Jobs
     *
     * @return jobs集合
     */
    List<Jobs> selectJobsByConditions(Jobs jobs);

    /**
     * 批量插入工作信息
     *
     * @param jobsList 工作信息集合
     */
    void insertBatchJobs(List<Jobs> jobsList);
}
