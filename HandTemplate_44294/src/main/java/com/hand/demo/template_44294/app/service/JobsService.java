package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Jobs;
import com.hand.demo.template_44294.domain.exception.CustomerException;
import com.hand.demo.template_44294.domain.vo.DepartmentVo;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
public interface JobsService {
    /**
     * 查询所有的Job
     *
     * @return jobs集合
     */
    List<Jobs> queryAllJobs();

    /**
     * 动态SQL:条件查询Jobs
     *
     * @return jobs集合
     */
    List<Jobs> queryJobsByConditions(Jobs jobs);

    /**
     * 批量插入工作信息
     *
     * @param jobsList 工作信息集合
     */
    void addBatchJobs(List<Jobs> jobsList) throws CustomerException;
}
