package com.clown.model;

import lombok.AllArgsConstructor;
import lombok.Data;

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
        System.out.println("Person创建...");
    }

    public void init(){
        System.out.println("Person初始化...");
    }

    public void destroy(){
        System.out.println("Person销毁...");
    }
}
