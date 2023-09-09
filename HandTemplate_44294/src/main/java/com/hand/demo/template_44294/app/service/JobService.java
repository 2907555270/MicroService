package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Job;
import com.hand.demo.template_44294.domain.exception.CustomerException;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
public interface JobService {
    /**
     * 查询所有的Job
     *
     * @return jobs集合
     */
    List<Job> queryAllJobs();

    /**
     * 动态SQL:条件查询Jobs
     *
     * @return jobs集合
     */
    List<Job> queryJobsByConditions(Job job);

    /**
     * 批量插入工作信息
     *
     * @param jobList 工作信息集合
     */
    void addBatchJobs(List<Job> jobList) throws CustomerException;

    /**
     * 查询提示
     *
     * @param job 输入查询信息
     * @return 查询结果
     */
    List<Job> searchTips(Job job);
}
