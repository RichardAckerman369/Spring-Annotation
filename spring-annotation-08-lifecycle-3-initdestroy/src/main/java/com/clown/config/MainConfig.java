package com.clown.config;

import com.clown.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 *
 * 使用JSR250规范
 * @PostConstruct : bean创建完成并且属性赋值完成,执行初始化
 * @PreDestroy : 在容器销毁之前通知我们进行销毁逻辑
 *
 **/
@Configuration
public class MainConfig {
    @Bean
    public Person person(){
        return new Person();
    }
}
