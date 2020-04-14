package com.zhuandian.service;

import com.zhuandian.pojo.Student;

public interface StudentService {
    Student findStudentById(int id);
    void deleteStudentById(int id);
}
