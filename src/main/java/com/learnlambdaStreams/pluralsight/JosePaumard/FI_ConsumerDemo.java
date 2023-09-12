package com.learnlambdaStreams.pluralsight.JosePaumard;

import java.util.function.Consumer;

public class FI_ConsumerDemo {

    public static void main(String[] args) {
        Consumer<String> oldConImplementation = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };

        Consumer<Integer> adder = (Integer a) -> System.out.println(a+a);

        oldConImplementation.accept("Hello");

        adder.accept(Integer.valueOf("5"));

    }
}
