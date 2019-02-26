package com.fangjie.mybatis.dao;

import com.fangjie.mybatis.bean.Teacher;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2019/2/25 15:03
 */
public interface TeacherDao {

    //    List<Teacher> getAllTeacher();
    Teacher getById(Integer teacherId);
}

