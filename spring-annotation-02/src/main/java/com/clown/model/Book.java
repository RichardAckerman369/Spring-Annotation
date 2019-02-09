package com.clown.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/9
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String bookName;
    private String author;
}
