package com.hand.demo.template_44294.api.controller.v1.responseBody;

import com.hand.demo.template_44294.app.service.JobsService;
import com.hand.demo.template_44294.domain.entity.Jobs;
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
@RequestMapping("/jobs")
public class JobsController {

    @Autowired
    private JobsService jobsService;

    /**
     * 获取所有的工作信息
     *
     * @return 工作信息
     */
    @GetMapping("/list")
    public Rs listAllJobs() {
        List<Jobs> jobs = jobsService.queryAllJobs();
        return Rs.success(null, jobs);
    }

    /**
     * 按条件查询工作信息
     *
     * @param jobs 查询条件
     * @return 符合条件的工作信息
     */
    @PostMapping("/list")
    public Rs listJobsByCondition(@RequestBody Jobs jobs) {
        List<Jobs> list = jobsService.queryJobsByConditions(jobs);
        return Rs.success(null, list);
    }
}
