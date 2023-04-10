package com.anzi;

import com.anzi.pojo.Books;
import com.anzi.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void t1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookServiceImpl bookServiceImpl = applicationContext.getBean("bookServiceImpl", BookServiceImpl.class);

        List<Books> li = bookServiceImpl.queryAllBook();

        System.out.println(li);

    }
}
