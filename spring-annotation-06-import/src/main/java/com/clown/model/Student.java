package com.clown.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/18
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Value("${李4}")
    private String studentName;
    @Value("#{18}")
    private Integer age;
}
