package com.knoldus;

public class Person
{
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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
    //function checking if a person is adult or not, it will return boolean
    public boolean personIsAdultOrNot(){
        if(age>= 18){
            return true;
        }
        else {
            return false;
        }
    }
}
