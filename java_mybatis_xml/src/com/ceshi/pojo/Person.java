package com.ceshi.pojo;
import java.util.List;
/*
 * 实体类 Person
 * */
public class Person {
    private int id;
    private String name;
    private int age;
    private int sex;
    private List<Girl> girls;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public List<Girl> getGirls() {
        return girls;
    }

    public void setGirls(List<Girl> girls) {
        this.girls = girls;
    }

    public String toString(){
        return "id = " + id + ", name = " + name + ", age = " + age;
    }
}
