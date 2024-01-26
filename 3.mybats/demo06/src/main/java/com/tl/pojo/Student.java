package com.tl.pojo;

import lombok.Data;

@Data
public class Student{
    private int id;
    private String username;

    //学生需要关联一个老师
    private Teacher teacher;
}
