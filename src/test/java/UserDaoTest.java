package test.java;

import main.java.dao.StudentDao;
import main.java.dao.StudentDaoImpl;
import main.java.entity.Student;

import java.io.IOException;

/**
 * @ProjectName: MybatisPractice2
 * @Package: test.java
 * @ClassName: UserDaoTest
 * @Author: 吕宁静
 * @Description:
 * @Date: 2019/11/1 21:06
 * @Version: 1.0
 */
public class UserDaoTest {
    public static void main(String[] args) {
       Student student;
       StudentDao studentDao = new StudentDaoImpl();
        try {
            student = studentDao.getUnionById(1);
            System.out.println(student.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
