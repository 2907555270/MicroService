package com.hand.demo.template_44294.app.service;

import com.hand.demo.template_44294.domain.entity.Jobs;
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
public class JobsServiceTest {

    @Autowired
    private JobsService jobsService;

    /**
     * 测试查询所有数据
     */
    @Test
    void testListAll() {
        System.out.println(jobsService.queryAllJobs());
    }

    /**
     * 测试按条件查询
     */
    @Test
    void testListByConditions() {
        // 设置部分条件
        Jobs jobs = new Jobs();
        jobs.setMaxSalary(9000);
        System.out.println(jobsService.queryJobsByConditions(jobs));
    }

    /**
     * 测试批量插入
     */
    @Test
    void testInsertMany() throws CustomerException {
        int n = 10;
        ArrayList<Jobs> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Jobs jobs = new Jobs();
            jobs.setJobId("TEST_" + i);
            jobs.setJobTitle("TEST_" + i);
            jobs.setMaxSalary(10);
            jobs.setMinSalary(10000);
            list.add(jobs);
        }

        jobsService.addBatchJobs(list);
    }
}
