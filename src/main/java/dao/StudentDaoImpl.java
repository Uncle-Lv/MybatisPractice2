package main.java.dao;

import main.java.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ProjectName: MybatisPractice2
 * @Package: main.java.dao
 * @ClassName: StudentImpl
 * @Author: 吕宁静
 * @Description: StudentDao的实现类
 * @Date: 2019/11/1 20:25
 * @Version: 1.0
 */
public class StudentDaoImpl implements StudentDao {
    private InputStream is;
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    public StudentDaoImpl() {
    }

    private void init() throws IOException {
        is = Resources.getResourceAsStream("main/resources/sqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
    }

    @Override
    public void insertStudent(Student student) throws IOException {
        this.init();
        sqlSession.insert("insertStudent", student);
        sqlSession.commit();
        this.close();
        System.out.println("添加成功！");
    }

    @Override
    public void deleteStudentById(int id) throws IOException {
        this.init();
        sqlSession.delete("deleteUserByName", id);
        sqlSession.commit();
        this.close();
        System.out.println("删除成功！");
    }

    @Override
    public Student getStudentById(int id) throws IOException {
        this.init();
        Student student = sqlSession.selectOne("getStudentById", id);
        sqlSession.commit();
        this.close();
        return student;
    }

    @Override
    public void updatePhoneById(int id, String phone) throws IOException {
        this.init();
        Student student = new Student();
        student.setId(id);
        student.setPhone(phone);
        sqlSession.update("updatePhoneById", student);
        sqlSession.commit();
        this.close();
        System.out.println("更改成功！");
    }

    @Override
    public Student getUnionById(int id) throws IOException {
        this.init();
        Student student = sqlSession.selectOne("getAllById", id);
        sqlSession.commit();
        this.close();
        return student;
    }

    private void close() {
        sqlSession.close();
    }
}
