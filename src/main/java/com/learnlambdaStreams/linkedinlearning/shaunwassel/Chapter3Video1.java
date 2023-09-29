package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter3Video1 {
//Map demo
    public static void main(String[] args) {

        Integer [] intArray = {10,20,30,40,50,60,70,80,90,100};
        List<Integer> listOfInt = new ArrayList<>(Arrays.asList(intArray));

        Function<Integer,Integer> doubleOf = (x) -> x*2;

        List<Integer> listOfDouble = listOfInt.stream()
                .map(doubleOf)
                .collect(Collectors.toList());

        listOfDouble.forEach(System.out::println);
    }
}
