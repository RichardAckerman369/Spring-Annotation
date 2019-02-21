package com.clown.service;

import com.clown.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/21
 **/
@Service
public class PersonService {

    //@Autowired(required = false)
    @Qualifier("personMapper")
    @Autowired
    private PersonMapper personMapper;

    public void printMapper(){
        System.out.println(personMapper);
    }


}
