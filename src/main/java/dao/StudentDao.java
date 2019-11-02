package main.java.dao;

import main.java.entity.Student;

import java.io.IOException;

/**
 * @ProjectName: MybatisPractice2
 * @Package: main.java.dao
 * @ClassName: StudentDao
 * @Author: 吕宁静
 * @Description: StudentDao类
 * @Date: 2019/11/1 19:39
 * @Version: 1.0
 */
public interface StudentDao {
    void insertStudent(Student student) throws IOException;
    void deleteStudentById(int id) throws IOException;
    Student getStudentById(int id) throws IOException;
    void updatePhoneById(int id, String phone) throws IOException;
    Student getUnionById(int id) throws IOException;
}
