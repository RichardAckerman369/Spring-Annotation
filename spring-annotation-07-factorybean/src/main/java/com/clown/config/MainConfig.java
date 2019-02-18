package com.clown.config;

import com.clown.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 **/
@Configuration
public class MainConfig {

    @Bean("person")
    public Person person(){
        return new Person("clown",12);
    }

    @Bean("studentFactory")
    public StudentFactory studentFactory(){
        return new StudentFactory();
    }
}
