package com.tl.dao;

import com.tl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
//
//    List<Teacher> getTeacher();


    //获取指定老师下的学生以及老师的信息
    Teacher getTeacher(@Param("tid") int id);

    //获取指定老师下的学生以及老师的信息
    Teacher getTeacher2(@Param("tid") int id);
}
