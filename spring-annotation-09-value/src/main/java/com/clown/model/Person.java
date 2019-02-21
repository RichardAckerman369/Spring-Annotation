package com.clown.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/21
 *
 * @Value
 *  1.基本数值              字符串
 *  2.SpEL表达式           #{...}
 *  3.取出配置文件中的值     ${...}
 *
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Value("clown")
    private String name;
    @Value("#{12-2}")
    private Integer age;
}
