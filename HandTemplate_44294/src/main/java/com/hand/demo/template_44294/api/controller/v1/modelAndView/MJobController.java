package com.hand.demo.template_44294.api.controller.v1.modelAndView;

import com.hand.demo.template_44294.app.service.JobsService;
import com.hand.demo.template_44294.domain.entity.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * description
 *
 * @author EMP_44294 2023/09/08 9:33
 */
@Controller
@RequestMapping("/model/job")
public class MJobController {

    @Autowired
    private JobsService jobsService;

    /**
     * 获取所有的工作信息
     *
     * @return 工作信息
     */
    @GetMapping("/list")
    public ModelAndView listAllJobs() {
        List<Jobs> jobs = jobsService.queryAllJobs();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("jobList", jobs);
        modelAndView.setViewName("jobs");
        return modelAndView;
    }

    /**
     * 按条件查询工作信息
     *
     * @param jobs 查询条件
     * @return 符合条件的工作信息
     */
    @PostMapping("/list")
    public ModelAndView listJobsByCondition(Jobs jobs) {
        List<Jobs> list = jobsService.queryJobsByConditions(jobs);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("jobList", list);
        modelAndView.addObject("searchCondition", jobs);
        modelAndView.setViewName("jobs");
        return modelAndView;
    }
}
