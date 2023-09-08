package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.JobsService;
import com.hand.demo.template_44294.domain.entity.Jobs;
import com.hand.demo.template_44294.domain.exception.CustomerException;
import com.hand.demo.template_44294.infra.mapper.JobsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    private JobsMapper jobsMapper;

    /**
     * 查询所有的Job
     *
     * @return jobs集合
     */
    @Override
    public List<Jobs> queryAllJobs() {
        return jobsMapper.selectAllJobs();
    }

    /**
     * 动态SQL:条件查询Jobs
     *
     * @return jobs集合
     */
    @Override
    public List<Jobs> queryJobsByConditions(Jobs jobs) {
        return jobsMapper.selectJobsByConditions(jobs);
    }

    /**
     * 批量插入工作信息
     *
     * @param jobsList 工作信息集合
     */
    @Override
    public void addBatchJobs(List<Jobs> jobsList) throws CustomerException {
        if(jobsList.isEmpty()){
            throw new CustomerException("插入数据为空");
        }
        jobsMapper.insertBatchJobs(jobsList);
    }


}
