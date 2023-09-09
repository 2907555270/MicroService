package com.hand.demo.template_44294.infra.mapper;


import com.hand.demo.template_44294.domain.entity.Job;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
public interface JobMapper {
    /**
     * 查询所有的Job
     *
     * @return jobs集合
     */
    List<Job> selectAllJobs();

    /**
     * 动态SQL:条件查询Jobs
     *
     * @return jobs集合
     */
    List<Job> selectJobsByConditions(Job job);

    /**
     * 批量插入工作信息
     *
     * @param jobList 工作信息集合
     */
    void insertBatchJobs(List<Job> jobList);

    /**
     * 工作信息搜索提示
     *
     * @param job 查询条件
     * @return 工作信息
     */
    List<Job> selectJobsTips(Job job);
}
