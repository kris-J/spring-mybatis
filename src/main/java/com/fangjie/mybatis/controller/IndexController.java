package com.fangjie.mybatis.controller;

import com.fangjie.mybatis.bean.Student;
import com.fangjie.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2019/2/25 15:42
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/student")
    public String students() {

        List<Student> allStudent = studentService.getAllStudent();
        for (Student student : allStudent) {
            System.out.println(student);
        }
        return "index/index";
    }
}
