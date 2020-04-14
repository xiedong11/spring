package com.zhuandian.mapper;

import com.zhuandian.pojo.Student;

public interface StudentMapper {
    Student findStudentById(int id);

    void deleteStudentById(int id);

    void insertStudentToDB(Student student);

    void updateStudent(Student student);
}
