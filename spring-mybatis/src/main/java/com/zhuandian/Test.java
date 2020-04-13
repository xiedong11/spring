package com.zhuandian;

import com.zhuandian.mapper.StudentMapper;
import com.zhuandian.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis-config.xml");
        StudentMapper studentMapper = context.getBean("StudentMapper", StudentMapper.class);
        Student student = studentMapper.findStudentById(1);

        System.out.println(student.getUsername());
    }
}
