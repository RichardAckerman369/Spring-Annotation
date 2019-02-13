package com.clown.test;

import com.clown.config.MainConfig;
import com.clown.model.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/13
 **/
public class PersonTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext ap = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanNames = ap.getBeanNamesForType(Person.class);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        Map<String, Person> persons = ap.getBeansOfType(Person.class);
        System.out.println(persons);

        //获取运行环境
        ConfigurableEnvironment environment = ap.getEnvironment();
        String systemName = environment.getProperty("os.name");
        System.out.println(systemName);//Windows 10
    }
}
