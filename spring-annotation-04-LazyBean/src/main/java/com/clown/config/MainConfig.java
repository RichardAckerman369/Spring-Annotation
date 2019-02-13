package com.clown.config;

import com.clown.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/13
 **/
@Configuration
public class MainConfig {

    /**
     *  懒加载: 针对单实例对象,默认容器启动时不创建对象,第一次使用时(获取时)再创建对象
     *  @Lazy
     */
    @Lazy
    @Bean("book")
    public Book book(){
        System.out.println("给容器添加book组件...");
        return new Book("红楼梦","曹雪芹");
    }
}
