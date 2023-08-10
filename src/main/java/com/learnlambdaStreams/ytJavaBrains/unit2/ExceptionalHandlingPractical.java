package com.learnlambdaStreams.ytJavaBrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionalHandlingPractical {

    public static void main(String[] args) {
        int [] someNumbs = {1,2,3,4,5};
        int key = 0;

        // old method to catch the exceptions

/*        processTheNumbers(someNumbs,key,(i,k)-> {
            try {

                System.out.println(i / k);

            }catch (ArithmeticException e){
                System.out.println("Caught in older way exception "+e);
            }
        });*/

        // new wrapper way of handling exception

        processTheNumbers(someNumbs,key,wrapperLambda((i,k) -> System.out.println(i+k)));


    }

    private static void processTheNumbers(int[] someNumbs, int key, BiConsumer<Integer,Integer> biConsumer) {

        for(int i : someNumbs){

            biConsumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> biConsumer){


        return (i,k) -> {

            try {

                biConsumer.accept(i,k);

            }catch (ArithmeticException e){
                System.out.println("Caught in New way exception "+e);
            }

        };
    }
}
