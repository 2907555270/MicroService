package com.hand.demo.template_44294.api.controller.v1.modelAndView;

import com.hand.demo.template_44294.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description
 *
 * @author EMP_44294 2023/09/08 13:37
 */
@Controller
@RequestMapping("/model/stu")
public class MStudentController {

    @Autowired
    private StudentService studentService;



}
