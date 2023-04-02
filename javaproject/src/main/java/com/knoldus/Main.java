package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = takeInput.nextLine();
        System.out.println("Enter age:");
        Integer age = takeInput.nextInt();
        Person person = new Person(name, age);
        //calling the function to check if a given person is adult or not
        Boolean isAdult = person.personIsAdultOrNot();
        if(isAdult){
            System.out.println(name+ " is adult");
        }
        else{
            System.out.println(name+" is not adult");
        }
    }
}