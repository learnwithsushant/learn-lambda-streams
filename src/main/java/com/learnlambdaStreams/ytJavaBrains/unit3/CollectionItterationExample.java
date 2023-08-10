package com.learnlambdaStreams.ytJavaBrains.unit3;

import com.learnlambdaStreams.ytJavaBrains.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionItterationExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Ram","Yadav",30),
                new Person("Laxuman","Pandav",31),
                new Person("Bharat","Doshi",32),
                new Person("Shatrugna","Raina",33),
                new Person("Udishtir","Dhamande",34)
        );

        // printing with for-each loop

        System.out.println("=================== Printing with for each loop=========================");

        people.forEach(System.out::println);

    }
}
