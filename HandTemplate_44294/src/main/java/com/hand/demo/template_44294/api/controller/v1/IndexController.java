package com.hand.demo.template_44294.api.controller.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * description
 *
 * @author EMP_44294 2023/09/08 9:22
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    /**
     * 进入首页
     *
     * @return 首页页面
     */
    @GetMapping("/{message}")
    public ModelAndView showIndexPage(@PathVariable String message) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", message);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /**
     * 进入工作信息查询页面
     * 前后端分离 elementUi and vue
     */
    @GetMapping("/job")
    public String showJobsPage(){
        return "job";
    }

    /**
     * 进入学生成绩管理界面
     */
    @GetMapping("/student/info")
    public String showStudentInfoPage(){
        return "student/info";
    }

}
