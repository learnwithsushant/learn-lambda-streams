package com.learnlambdaStreams.ytJavaBrains.unit2;

import com.learnlambdaStreams.ytJavaBrains.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LearnLambdaExample2 {
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
        performContitionally(people, p-> true,p-> System.out.println(p));

        //Create a method that prints all the name starting with D
        System.out.println("===================Create a method that prints all the lastname starting with D using lambda=========================");
        performContitionally(people, p -> p.getLastName().startsWith("D"),p-> System.out.println(p) );
        System.out.println("============================================");
        System.out.println("===================Create a method that prints all the firstname starting with B using lambda=========================");
        performContitionally(people, p -> p.getFirstName().startsWith("B"),p-> System.out.println(p));
        System.out.println("============================================");
    }




    private static void performContitionally(List<Person> people, Predicate<Person> condition, Consumer<Person> personConsumer) {

        for (Person p : people){

            if(condition.test(p)){
                personConsumer.accept(p);
            }
        }

    }

  /*  private static void printall(List<Person> people) {
        for (Person p : people){

            System.out.println(p);
        }

    }*/



}

