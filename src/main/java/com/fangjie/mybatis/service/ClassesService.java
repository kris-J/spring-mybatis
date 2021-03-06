package com.fangjie.mybatis.service;

import com.fangjie.mybatis.bean.Classes;
import com.fangjie.mybatis.bean.Student;
import com.fangjie.mybatis.dao.ClassesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2019/2/25 15:26
 */
@Service
public class ClassesService {

    @Autowired
    ClassesDao classesDao;

    public List<Classes> getAllClasses() {
        return classesDao.getAllClasses();
    }

}
