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
public class Classmate {
    @Value("${张3}")
    private String classmateName;
    @Value("#{12}")
    private Integer age;
}
