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
public class Teacher {
    @Value("${王5}")
    private String teacherName;
    @Value("#{50}")
    private Integer age;
}
