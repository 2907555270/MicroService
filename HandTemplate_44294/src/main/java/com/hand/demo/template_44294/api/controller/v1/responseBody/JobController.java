package com.hand.demo.template_44294.api.controller.v1.responseBody;

import com.hand.demo.template_44294.app.service.JobService;
import com.hand.demo.template_44294.domain.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/07 15:41
 */
@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    /**
     * 获取所有的工作信息
     *
     * @return 工作信息
     */
    @GetMapping("/list")
    public Rs listAllJobs() {
        List<Job> jobs = jobService.queryAllJobs();
        return Rs.success(null, jobs);
    }

    /**
     * 查询提示
     *
     * @param job 输入查询信息
     * @return 查询结果
     */
    @PostMapping("/tips")
    public Rs jobIdTip(@RequestBody Job job) {
        List<Job> jobList = jobService.searchTips(job);
        return Rs.success(null, jobList);
    }

    /**
     * 按条件查询工作信息
     *
     * @param job 查询条件
     * @return 符合条件的工作信息
     */
    @PostMapping("/list")
    public Rs listJobsByCondition(@RequestBody Job job) {
        List<Job> list = jobService.queryJobsByConditions(job);
        return Rs.success(null, list);
    }
}
