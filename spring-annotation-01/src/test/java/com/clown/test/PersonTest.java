package com.clown.test;

import com.clown.config.MyConfig;
import com.clown.model.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/9
 **/
public class PersonTest {

    public static void main(String[] args){
        annotationTest();
        xmlTest();
    }

    private static void annotationTest() {
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = (Person) ap.getBean("person");
        Person person1 = ap.getBean(Person.class);
        System.out.println(person);
        System.out.println(person1);
    }

    private static void xmlTest() {
        ClassPathXmlApplicationContext ap = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) ap.getBean("person");
        System.out.println(person);
    }
}
