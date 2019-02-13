package com.clown.config;

import com.clown.conditions.LinuxCondition;
import com.clown.conditions.WindowsCondition;
import com.clown.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/13
 **/
@Configuration
public class MainConfig {

    /**
     * @Conditional({condition数组[就是条件]}) : 按照一定的条件进行判断,满足一定条件后再向容器中注册bean
     * 放在类上可以对类进行统一设置
     * 需求: 如果系统是Windows 就将clown添加到容器中
     *      如果系统是Linux   就将joker添加到容器中
     *
     */
    @Conditional({WindowsCondition.class})
    @Bean("clown")
    public Person clown(){
        //System.out.println("IOC容器添加clown组件...");
        return new Person("clown",12);
    }

    @Conditional(LinuxCondition.class)
    @Bean("joker")
    public Person joker(){
        //System.out.println("IOC容器添加joker组件...");
        return new Person("joker",20);
    }
}
