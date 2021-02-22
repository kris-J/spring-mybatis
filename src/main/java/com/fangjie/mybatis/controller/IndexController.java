package com.fangjie.mybatis.controller;

import com.fangjie.mybatis.bean.Classes;
import com.fangjie.mybatis.bean.Student;
import com.fangjie.mybatis.service.ClassesService;
import com.fangjie.mybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2019/2/25 15:42
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController{

    @Autowired
    StudentService studentService;

    @Autowired
    ClassesService classesService;

    /**
     * 学生列表
     *
     * @param model
     * @return
     */
    @RequestMapping("/student")
    public String list(Model model) {
        List<Student> allStudent = studentService.getAllStudent();
        model.addAttribute("students", allStudent);
        return "index/student";
    }

    /**
     * 根据ID获取学生ID
     *
     * @return
     */
    @RequestMapping("/student/getById")
    @ResponseBody
    public Student info(@RequestParam("studentId") Integer studentId) {
        Student student = studentService.getById(studentId);
        return student;
    }

    /**
     * 课程列表
     *
     * @param model
     * @return
     */
    @RequestMapping("/classes")
    public String listClasses(Model model) {
        List<Classes> allClasses = classesService.getAllClasses();
        model.addAttribute("classes", allClasses);
        return "index/classes";
    }
}
