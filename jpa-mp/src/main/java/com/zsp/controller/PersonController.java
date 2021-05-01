package com.zsp.controller;

import com.zsp.pojo.Person;
import com.zsp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @GetMapping("/addPerson/{name}/{age}")
    public String addPerson(@PathVariable(value = "name") String name,
                            @PathVariable(value = "age") int age){

        personRepository.save(new Person(null,name,age));
        return "添加成功";
    }


}

