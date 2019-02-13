package com.clown.test;

import com.clown.config.MainConfig;
import com.clown.model.Book;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/13
 **/
public class BookTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC容器创建完成...");
        Book book1 = (Book) ap.getBean("book");
        Book book2 = (Book) ap.getBean("book");
        System.out.println(book1 == book2);
    }
}
