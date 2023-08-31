package com.learnlambdaStreams.StreamsPracticals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamsPracticals {

    public static void main(String[] args) {
        //intStreamDemo();
        //intStreamWithSkipDemo();
       // printSumInStream();

        sortString();
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

    public static void printSumInStream(){
        System.out.println("Stream Demo");
        System.out.println(IntStream.range(1,5).sum());
    }

    public static void sortString(){

        Stream.of("Shivshakti","Pragyan","Vikram")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
