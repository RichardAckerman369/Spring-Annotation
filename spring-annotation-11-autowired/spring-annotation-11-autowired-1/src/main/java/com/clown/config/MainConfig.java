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
 * @Autowired: 自动注入 1组件依赖2组件,只需要在1组件中使用@Autowired注解,2组件就自动注入到1组件中
 *  1.优先按照类型去IOC容器中寻找对应的组件,找到就赋值
 *  2.如果找到多个类型相同的组件,再将属性的名称作为组件的id到IOC容器中查找
 *  3.@Qualifier("组件id") 明确使用哪一个组件
 *  4.自动装配一定要在容器中找到这个组件,才能够装配,否则就报错
 *  5.@Autowired(required = false) 调整如果IOC容器中没有这个组件,就不装配,而不会报错
 *
 * @Primary :让Spring进行自动装配时,默认使用首选的bean,带有@Primary注解的
 *
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
