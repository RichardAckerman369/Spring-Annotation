package com.clown.controller;

import com.clown.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author: Richard·Ackerman
 * @create: 2019/2/21
 **/
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;
}
