package com.clown.test;

import com.clown.config.MainConfig;
import com.clown.model.Book;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/9
 **/
public class BookTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = ap.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        //默认是单实例的
        Book book1 = (Book) ap.getBean("book");
        Book book2 = (Book) ap.getBean("book");
        System.out.println(book1 == book2);
    }
}
