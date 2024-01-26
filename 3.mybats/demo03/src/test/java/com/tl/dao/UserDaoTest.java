package com.tl.dao;

import com.tl.pojo.User;
import com.tl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest{
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        方式一getmapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList= mapper.getUserList();
        System.out.println(userList);
        //方式二
////        List<User> userList = sqlSession.selectList("com.tl.dao.UserDao.getUserList");
//        for (User user : userList) {
//            System.out.println(user);
//        }

        sqlSession.close();
    }
}
