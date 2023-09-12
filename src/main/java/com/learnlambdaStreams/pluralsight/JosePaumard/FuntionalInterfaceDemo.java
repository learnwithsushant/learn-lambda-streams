package com.learnlambdaStreams.pluralsight.JosePaumard;

import java.util.function.Supplier;

public class FuntionalInterfaceDemo {

    public static void main(String[] args) {
        Supplier<String> oldImplementation = new Supplier<String>() {
            @Override
            public String get() {
                return "Old Implementation";
            }
        } ;

        Supplier<String> newLambdaExpression = () -> "new lambda implementation";

        System.out.println(oldImplementation.get());

        System.out.println(newLambdaExpression.get());
    }
}
