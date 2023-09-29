package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.function.Function;

public class ReturningFunctionDemo {

    public  static Function<Integer,Integer> createMultiplier(Integer y){
        return (Integer x) -> x*y;
    }

    public static void main(String[] args) {
        NoArgsFunction<NoArgsFunction<String>> createGretter = () -> () -> "Return a function demo";

        NoArgsFunction<String> gretter = createGretter.applyNoArgs();

        System.out.println(gretter.applyNoArgs());

        Function<Integer,Integer> twoTimes = ReturningFunctionDemo.createMultiplier(2);
        Function<Integer,Integer> threeTimes = ReturningFunctionDemo.createMultiplier(3);
        Function<Integer,Integer> fourTimes = ReturningFunctionDemo.createMultiplier(4);

        System.out.println(twoTimes.apply(4));
        System.out.println(threeTimes.apply(4));
        System.out.println(fourTimes.apply(4));



    }
}
