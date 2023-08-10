package com.learnlambdaStreams.StreamsPracticals;

import java.util.stream.IntStream;

public class JavaStreamsPracticals {

    public static void main(String[] args) {
        //intStreamDemo();
        intStreamWithSkipDemo();
    }

    public static void intStreamDemo(){

        IntStream.range(1,10).forEach(System.out::println);
        System.out.println();

    }

    public static void intStreamWithSkipDemo(){

        IntStream.
                range(1,10).
                skip(4).
                forEach(x-> System.out.println(x));
        System.out.println();

    }
}
