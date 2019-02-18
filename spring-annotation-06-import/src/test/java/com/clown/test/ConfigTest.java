package com.clown.test;

import com.clown.config.ImportConfig;
import com.clown.model.Classmate;
import com.clown.model.Person;
import com.clown.model.Rainbow;
import com.clown.model.Student;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 **/
public class ConfigTest {
    AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(ImportConfig.class);
    /**
     * 打印所有组件名称
     */
    @Test
    public void printAllBeans(){
        String[] beanNames = ap.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    @Test
    public void testPerson(){
        Person person = (Person) ap.getBean("person");
        System.out.println(person);
    }

    @Test
    public void testStudent(){
        Student student = ap.getBean(Student.class);
        System.out.println(student);
    }

    @Test
    public void testClassmate(){
        Classmate classmate = ap.getBean(Classmate.class);
        System.out.println(classmate);
    }

    @Test
    public void testRainbow(){
        Rainbow rainbow = ap.getBean(Rainbow.class);
        System.out.println(rainbow);
    }
}
