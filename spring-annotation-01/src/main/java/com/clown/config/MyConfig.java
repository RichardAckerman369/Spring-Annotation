package com.clown.config;

import com.clown.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/9
 * 配置类 == 配置文件
 **/
@Configuration
public class MyConfig {

    //给容器中注册一个Bean 类型为返回值的类型.id为方法名
    @Bean("person")
    public Person person(){
       return new Person("Joker",20);
    }
}
