package com.tl.dao;

import com.tl.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
      //获取全部用户
      List<User> getUserList();

      List<User> getUserLike(String value);
      List<User> addUser2(Map<String,Object> map);

      //根据ID查询用户
      User getUserById(int id);
      User getUserById2(Map<String,Object> map);
      //insert用户

      int addUser(User user);



}
