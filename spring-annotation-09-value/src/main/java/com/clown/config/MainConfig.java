package com.clown.config;

import com.clown.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/21
 **/
@Configuration
public class MainConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
