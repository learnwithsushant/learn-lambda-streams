package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Chapter3Video3 {

    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> listOfInt = new ArrayList<>(Arrays.asList(intArray));

        BinaryOperator<Integer> getSum = (acc,x) -> {

            Integer result = acc + x;
            System.out.println("acc: "+acc+" ,x :  "+x+" result :"+result);
            return  result;

        };

        Integer result = listOfInt.stream()
                .reduce(0,getSum);

        System.out.println("Sum is:- "+result);

    }
}
