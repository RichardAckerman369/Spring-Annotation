package com.clown.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 **/
@Data
@AllArgsConstructor
public class Person {

    private String name;
    private Integer age;

    public Person(){
        System.out.println("Person 创建...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Person 初始化...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Person 销毁...");
    }
}
