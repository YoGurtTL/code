import com.tl.dao.StudentMapper;
import com.tl.dao.TeacherMapper;
import com.tl.pojo.Student;
import com.tl.pojo.Teacher;
import com.tl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class tess {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = teacherMapper.getTeacher(1);
        System.out.println(teacher );
        sqlSession.close();
    }

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudent();
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void test2(){
           SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudent2();
        for(Student student : studentList){
            System.out.println(student);
        }
        sqlSession.close();
    }
}
