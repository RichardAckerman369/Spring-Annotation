package com.clown.model;

import com.clown.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

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
        Person person = ap.getBean(Person.class);
        System.out.println(person);
    }
    
    @Test
    public void test03(){
        Environment environment = ap.getEnvironment();
        String nickName = environment.getProperty("person.nickName");
        System.out.println(nickName);

    }
}