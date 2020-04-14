package com.zhuandian.service.impl;

import com.zhuandian.mapper.StudentMapper;
import com.zhuandian.pojo.Student;
import com.zhuandian.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public Student findStudentById(int id) {
        System.out.println(id + "——----------");
        return studentMapper.findStudentById(id);
    }


    /**
     * 删除指定id的学生
     * @param id
     */
    public void deleteStudentById(int id) {
        studentMapper.deleteStudentById(id);
    }

    /**
     * 插入一个学生
     * @param student
     */
    public void insertStudentToDB(Student student) {
        studentMapper.insertStudentToDB(student);
    }
}
