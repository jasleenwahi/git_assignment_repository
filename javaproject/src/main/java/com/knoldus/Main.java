package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //calling constructor
        Person person = new Person("Jasleen", 23);

        //using setters
        person.setName("Jasleen");
        person.setAge(23);
        //calling the function to check if a given person is adult or not
        Boolean isAdult = person.personIsAdultOrNot(person.getAge());
        if(isAdult)
            System.out.println(person.getName()+" is an adult");
        else
            System.out.println(person.getName()+" is not adult");

    }
}