import com.tl.dao.UserMapper;
import com.tl.pojo.User;
import com.tl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class tes {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<User> users = userMapper.getUsers();
//        for(User user : users){
//            System.out.println(user);
//        }
        User userById =userMapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();

    }
}
