package com.zhuandian;

import com.zhuandian.dao.Hello;
import com.zhuandian.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
    public static void main(String[] args) {
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //从上下文中获取hello实例
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

        User user = context.getBean("user", User.class);
        user.setHello(hello);
        System.out.println(user.getHello().getName());
    }
}
