package com.clown.config;

import com.clown.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 *
 * bean的生命周期: bean创建-->初始化-->销毁
 * IOC容器管理bean的生命周期
 * 我们可以自定义bean的初始化和销毁
 *
 * 1.指定初始化和销毁方法 :
 *      xml指定 : init-method="" destroy-method=""
 *      @Bean : 通过@Bean注解指定初始化,销毁方法
 *      单实例: 容器创建时创建bean,bean赋值完成后初始化bean,容器关闭销毁bean
 *      多实例: 容器创建时不创建bean,获取时创建bean,并初始化bean,容器关闭时,不销毁bean,你自己销毁
 *
 **/
@Configuration
public class MainConfig {

    //@Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Person person(){
        return new Person();
    }
}
