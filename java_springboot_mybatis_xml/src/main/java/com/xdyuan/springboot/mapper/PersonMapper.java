package com.xdyuan.springboot.mapper;

import com.xdyuan.springboot.pojo.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface PersonMapper {

    public List<Person> findAll();

    public Person findById(int id);

    public void updatePerson(Person person);

    public void deletePerson(int id);

    public void savePerson(Person person);
}
