package com.tl.dao;

import com.tl.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

      @Select("select * from user")
      List<User> getUsers();

      @Select("select * from user where id = #{id}")
      User getUserById(@Param("id") int id);

}

