package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Job;
import com.hand.demo.template_44294.domain.exception.CustomerException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 15:46
 */
@SpringBootTest
public class JobServiceTest {

    @Autowired
    private JobService jobService;

    /**
     * 测试查询所有数据
     */
    @Test
    void testListAll() {
        System.out.println(jobService.queryAllJobs());
    }

    /**
     * 测试按条件查询
     */
    @Test
    void testListByConditions() {
        // 设置部分条件
        Job job = new Job();
        job.setMaxSalary(9000);
        System.out.println(jobService.queryJobsByConditions(job));
    }

    /**
     * 测试批量插入
     */
    @Test
    void testInsertMany() throws CustomerException {
        int n = 10;
        ArrayList<Job> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Job job = new Job();
            job.setJobId("TEST_" + i);
            job.setJobTitle("TEST_" + i);
            job.setMaxSalary(10);
            job.setMinSalary(10000);
            list.add(job);
        }

        jobService.addBatchJobs(list);
    }
}
