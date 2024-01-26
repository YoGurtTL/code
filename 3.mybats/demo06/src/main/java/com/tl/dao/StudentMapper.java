package com.tl.dao;

import com.tl.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询所有的学生以及老师的信息
    public List<Student> getStudent();
    //查询所有的学生以及老师的信息
    public List<Student> getStudent2();
}
