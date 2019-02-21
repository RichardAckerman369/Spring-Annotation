package com.clown.config;

import com.clown.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/21
 *
 * @PropertySource: 读取外部配置文件中的属性值保存到运行中的环境变量中,加载完外部的配置文件后使用${...}取出外部配置文件的属性值
 *
 **/
@PropertySource(value={"classpath:/person.properties"})
@Configuration
public class MainConfig {

    @Bean("person")
    public Person person(){
        return new Person();
    }
}
