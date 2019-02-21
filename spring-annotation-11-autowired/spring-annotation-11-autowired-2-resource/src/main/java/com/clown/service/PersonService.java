package com.clown.service;

import com.clown.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/21
 **/
@Service
public class PersonService {

    //@Resource(name = "personMapper2")
    //@Resource
    @Inject
    private PersonMapper personMapper;

    public void printMapper(){
        System.out.println(personMapper);
    }


}
