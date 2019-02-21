package com.clown.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/21
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;
}
