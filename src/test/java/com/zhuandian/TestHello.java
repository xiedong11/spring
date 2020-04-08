package com.zhuandian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
