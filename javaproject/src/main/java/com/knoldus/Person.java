package com.knoldus;

public class Person
{
    //applying encapsulation
    private String name;
    private Integer age;

    public Person(String name, Integer age) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //person which checks if person is adult or not
    public boolean personIsAdultOrNot(Integer age){
        if(age>= 18){
            return true;
        }
        else {
            return false;
        }
    }
}
