package com.clown.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 **/
@Component
@Data
@AllArgsConstructor
public class Person implements InitializingBean, DisposableBean {
    private String name;
    private Integer age;
    public Person(){
        System.out.println("Person创建...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Person 初始化...");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("Person 销毁...");
    }


}
