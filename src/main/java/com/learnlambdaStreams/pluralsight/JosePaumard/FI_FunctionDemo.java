package com.learnlambdaStreams.pluralsight.JosePaumard;

import java.util.function.Function;

public class FI_FunctionDemo {
    public static void main(String[] args) {
        Function<String , Integer> stringCounter = s -> s.length();

        System.out.println("Lenght Counter :"+stringCounter.apply("Pythons"));
    }
}
