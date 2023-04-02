package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jasleen", 23);
        //using setter methods
        person.setName("Jasleen");
        person.setAge(23);
        //using getter method
        Integer age = person.getAge();
        Boolean isAdult = person.personIsAdultOrNot();

        //checking if person is adult or not
        if(isAdult){
            System.out.println(person.getName()+ " is adult");
        }
        else{
            System.out.println(person.getName()+" is not adult");
        }
    }
}