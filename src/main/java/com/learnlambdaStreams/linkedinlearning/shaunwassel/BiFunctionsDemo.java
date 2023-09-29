package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.function.BiFunction;

public class BiFunctionsDemo {
    public static void main(String[] args) {
        BiFunction<String,String,String> stringConcat = (a,b) -> a.concat(b);
        System.out.println(stringConcat.apply("Mahindra ","Dhoni"));

        TriFunction<Integer,Integer,Integer,Integer> average = (a,b,c) -> a+b+c;
        System.out.println(average.applyTriFunction(1,2,3));

        NoArgsFunction<Integer> noArgsFunction = () -> 100;
        System.out.println(noArgsFunction.applyNoArgs());
    }
}
