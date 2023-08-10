package com.learnlambdaStreams.ytJavaBrains.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionHandlingNonLambda {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Ram","Yadav",30),
                new Person("Laxuman","Pandav",31),
                new Person("Bharat","Doshi",32),
                new Person("Shatrugna","Raina",33),
                new Person("Udishtir","Dhamande",34)
        );

        // Sort list by last name

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getFirstName());
            }
        });

        // Create a method that prints  all the elements in the list
        printall(people);

        //Create a method that prints all the name starting with D

        printSurnameStartingWithAChar(people,new Condition(){
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("D");
            }
        });

        printSurnameStartingWithAChar(people,new Condition(){
            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("B");
            }
        });
    }




    private static void printSurnameStartingWithAChar(List<Person> people,Condition condition) {

        for (Person p : people){

            if(condition.test(p)){
                System.out.println(p);
            }
        }

    }

    private static void printall(List<Person> people) {
        for (Person p : people){

            System.out.println(p);
        }

    }



}

interface Condition{
    boolean test(Person p);

}