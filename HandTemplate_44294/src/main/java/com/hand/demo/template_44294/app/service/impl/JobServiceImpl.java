package com.hand.demo.template_44294.app.service.impl;

import com.hand.demo.template_44294.app.service.JobService;
import com.hand.demo.template_44294.domain.entity.Job;
import com.hand.demo.template_44294.domain.exception.CustomerException;
import com.hand.demo.template_44294.infra.mapper.JobMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 11:26
 */
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;

    /**
     * 查询所有的Job
     *
     * @return jobs集合
     */
    @Override
    public List<Job> queryAllJobs() {
        return jobMapper.selectAllJobs();
    }

    /**
     * 动态SQL:条件查询Jobs
     *
     * @return jobs集合
     */
    @Override
    public List<Job> queryJobsByConditions(Job job) {
        return jobMapper.selectJobsByConditions(job);
    }

    /**
     * 批量插入工作信息
     *
     * @param jobList 工作信息集合
     */
    @Override
    public void addBatchJobs(List<Job> jobList) throws CustomerException {
        if(jobList.isEmpty()){
            throw new CustomerException("插入数据为空");
        }
        jobMapper.insertBatchJobs(jobList);
    }

    /**
     * 查询提示
     *
     * @param job 输入查询信息
     * @return 查询结果
     */
    @Override
    public List<Job> searchTips(Job job) {
        return jobMapper.selectJobsTips(job);
    }


}
