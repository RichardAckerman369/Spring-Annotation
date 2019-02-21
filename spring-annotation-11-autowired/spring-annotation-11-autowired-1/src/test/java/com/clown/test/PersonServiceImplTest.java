package com.clown.test;

import com.clown.config.MainConfig;
import com.clown.mapper.PersonMapper;
import com.clown.service.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonServiceImplTest {

    ApplicationContext ap = new AnnotationConfigApplicationContext(MainConfig.class);

    @Test
    public void test01(){
        PersonService personService = ap.getBean(PersonService.class);
        personService.printMapper();

        //测试@Primary注解
        PersonMapper personMapper = ap.getBean(PersonMapper.class);
        System.out.println(personMapper);
    }
}