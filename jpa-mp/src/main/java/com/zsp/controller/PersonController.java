package com.zsp.controller;


import com.alibaba.fastjson.JSON;

import com.zsp.entity.Person;
import com.zsp.repository.PersonRepository;
import com.zsp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    PersonService personService;
    @GetMapping("/addPerson/{name}/{age}")
    public String addPerson(@PathVariable(value = "name") String name,
                            @PathVariable(value = "age") int age){
        Person person = new Person();
        person.setId(null);
        person.setName(name);
        person.setAge(age);
        personRepository.save(person);
        return "添加成功";
    }
    @GetMapping("update/{id}/{name}/{age}")
    public String updatePerson( @PathVariable(value = "id") Long id,
                                @PathVariable(value = "name") String name,
                                @PathVariable(value = "age") int  age){
        Person person = new Person();
        person.setId(null);
        person.setName(name);
        person.setAge(age);
        System.out.println(id+name+age);
        return JSON.toJSONString(personService.updateById(person));
    }
    @GetMapping("select")
    public String selectPerson(){


        return JSON.toJSONString(personService.count() );
    }


}

