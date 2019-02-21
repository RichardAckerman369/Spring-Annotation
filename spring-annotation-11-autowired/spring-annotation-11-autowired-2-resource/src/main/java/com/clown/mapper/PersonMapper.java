package com.clown.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/21
 **/
@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonMapper {

    private String label = "1";
}
