package com.clown.test;

import com.clown.config.MainConfig;
import com.clown.model.Person;
import com.clown.model.Student;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 **/
public class ConfigTest {

    AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void printBeans(){
        String[] beanNames= ap.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    @Test
    public void personTest(){
        Person person = ap.getBean(Person.class);
        System.out.println(person);
    }

    //测试单实例:实际获取的是getObject()方法创建的student
    @Test
    public void studentTest(){
        Student studentFactory = (Student) ap.getBean("studentFactory");
        System.out.println(studentFactory.getClass());
        System.out.println(studentFactory);
    }

    //获取工厂本身使用 "&" 符号
    @Test
    public void studentFactoryTest(){
        Object studentFactory = ap.getBean("&studentFactory");
        System.out.println(studentFactory.getClass());
        System.out.println(studentFactory);
    }
}
