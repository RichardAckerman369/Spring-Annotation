package com.clown.config;

import com.clown.mapper.PersonMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/21
 *
 * 自动装配:
 *          Spring 利用依赖注入(DI),完成对IOC容器中的各个组件的依赖关系赋值
 * Spring 还支持@Resource和@Inject注解进行自动装配(java规范注解)
 *
 *  @Resource : 可以和@Autowried 一样进行自动装配,默认使用组件名称进行装配
 *              没有支持@Primary的功能
 *   @Inject : 和@Autowried功能一样都可以进行自动装配,支持@Primary的功能,但是没有required=false功能
 *              需要先导入依赖
 **/
@Configuration
@ComponentScan({"com.clown.service","com.clown.mapper","com.clown.controller"})
public class MainConfig {

    @Primary
    @Bean("personMapper2")
    public PersonMapper personMapper(){
        return new PersonMapper("2");
    }
}
