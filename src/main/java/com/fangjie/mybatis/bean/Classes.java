package com.fangjie.mybatis.bean;

import java.util.List;

/**
 * @author fangjie
 * @Description: ${todo}
 * @date 2019/2/21 16:16
 */
//@Alias("classes") //注解方式声明别名
public class Classes {

    private Integer id;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"teacher\":")
                .append(teacher);
        sb.append(",\"students\":")
                .append(students);
        sb.append('}');
        return sb.toString();
    }
}
