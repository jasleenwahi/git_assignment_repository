package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jasleen", 23);
        person.setName("Jasleen");
        person.setAge(23);
        // checking if person is adult or not.
        System.out.println("Is "+ person.getName()+" adult ?: " +person.personIsAdultOrNot());
    }
}