package com.xdyuan.springboot.web;

import com.alibaba.fastjson.JSON;
import com.xdyuan.springboot.mapper.PersonMapper;
import com.xdyuan.springboot.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonMapper personMapper;

    @GetMapping("/list")
    public String listPerson() throws Exception {
        List<Person> ps = personMapper.findAll();
        return JSON.toJSONString(ps);
    }

    @PostMapping("/save/person")
    public String savePerson(@RequestBody Person person) throws Exception {
        personMapper.savePerson(person);
        return "ok";
    }

    @GetMapping("/person")
    public String getPerson(@RequestParam int id) throws Exception {
        Person p = personMapper.findById(id);
        return JSON.toJSONString(p);
    }

    @PostMapping("/update/person")
    public String updatePerson(@RequestBody Person person) throws Exception{
        personMapper.updatePerson(person);
        return "ok";
    }

    @DeleteMapping("/delete/person")
    public String deleteperson(@RequestParam int id) throws Exception{
        personMapper.deletePerson(id);
        return "ok";
    }
}
