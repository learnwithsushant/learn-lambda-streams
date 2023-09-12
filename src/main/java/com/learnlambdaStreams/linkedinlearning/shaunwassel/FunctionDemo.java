package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.function.Function;

public class FunctionDemo {
    public static Integer tripleIt(int x){
        return x*3;
    }
    public static void main(String[] args) {
        Function<Integer,Integer> myFunction = FunctionDemo::tripleIt;
        System.out.println("Print triple of "+myFunction.apply(5));

    }
}
