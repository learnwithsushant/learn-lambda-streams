package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.function.BiFunction;

public class FunAsArgumentDemo {
    public static Integer add(Integer a, Integer b){
        return a+b;
    }

    public static Integer substract(Integer a, Integer b){
        return a-b;
    }

    public static Integer biFunctionApplier(BiFunction<Integer,Integer,Integer> biFunction){
        return biFunction.apply(10,5);
    }

    public static void main(String[] args) {
        System.out.println(FunAsArgumentDemo.biFunctionApplier(FunAsArgumentDemo::add));
        System.out.println(FunAsArgumentDemo.biFunctionApplier(FunAsArgumentDemo::substract));
        System.out.println(FunAsArgumentDemo.biFunctionApplier((x,y)->2*x+3*y));
    }

}
