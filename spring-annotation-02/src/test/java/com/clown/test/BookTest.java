package com.clown.test;

import com.clown.config.MyConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/9
 **/
public class BookTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] names = ap.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
