package com.knoldus;

public class Person
{
    // applying encapsulation to the class.
    private String name;
    private Integer age;

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

    // person which checks if person is adult or not.
    public boolean personIsAdultOrNot(){
        if(getAge() >= 18){
            return true;
        }
        else {
            return false;
        }
    }
}
