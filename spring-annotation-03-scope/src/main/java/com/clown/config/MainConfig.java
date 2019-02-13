package com.clown.config;

import com.clown.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/13
 **/
@Configuration
public class MainConfig {

    //默认是单实例的
    /**
     * @Scope:指定bean的作用范围
     *
     * SCOPE_PROTOTYPE  多实例        IOC容器启动后不会创建对象,对象被调用时才创建对象,没次调用都会创建新的对象
     * SCOPE_SINGLETON  单实例(默认值) IOC容器启动时会调用方法创建对象,将对象放入IOC容器中
     * SCOPE_REQUEST    同一次请求创建一个实例
     * SCOPE_SESSION    同一个session创建一个实例
     */
    @Scope("prototype")
    //@Scope
    @Bean("book")
    public Book book(){
        return new Book("红楼梦","曹雪芹");
    }
}
