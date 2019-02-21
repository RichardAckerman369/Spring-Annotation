package com.clown.model;

import com.clown.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonTest {

    ApplicationContext ap = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void test01(){
        String[] names = ap.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }

    @Test
    public void test02(){
        Person person = (Person) ap.getBean("person");
        System.out.println(person);

    }
}