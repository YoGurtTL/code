package com.tl.dao;

import com.tl.pojo.User;

import java.util.List;

public interface UserMapper {
      //获取全部用户
      List<User> getUserList();


      //根据ID查询用户
      User getUserById(int id);


      int addUser(User user);



}
