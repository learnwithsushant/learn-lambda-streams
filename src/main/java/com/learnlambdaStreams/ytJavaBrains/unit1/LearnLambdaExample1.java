package com.learnlambdaStreams.ytJavaBrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class LearnLambdaExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ram","Yadav",30),
                new Person("Laxuman","Pandav",31),
                new Person("Bharat","Doshi",32),
                new Person("Shatrugna","Raina",33),
                new Person("Udishtir","Dhamande",34)
        );

        // Sort list by last name
        System.out.println("===================Sort list by last name using lambda=========================");
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getFirstName()));
        System.out.println("============================================");
        // Create a method that prints  all the elements in the list
        printContitionally(people, p-> true);

        //Create a method that prints all the name starting with D
        System.out.println("===================Create a method that prints all the lastname starting with D using lambda=========================");
        printContitionally(people, p -> p.getLastName().startsWith("D") );
        System.out.println("============================================");
        System.out.println("===================Create a method that prints all the firstname starting with B using lambda=========================");
        printContitionally(people, p -> p.getFirstName().startsWith("B"));
        System.out.println("============================================");
    }




    private static void printContitionally(List<Person> people, Condition condition) {

        for (Person p : people){

            if(condition.test(p)){
                System.out.println(p);
            }
        }

    }

  /*  private static void printall(List<Person> people) {
        for (Person p : people){

            System.out.println(p);
        }

    }*/



}

