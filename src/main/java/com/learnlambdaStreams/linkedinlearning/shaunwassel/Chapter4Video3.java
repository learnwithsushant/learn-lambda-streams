package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class Chapter4Video3 {

    public static void main(String[] args) {
        IntFunction<Long> factorialCalc = Chapter4Video3::factorial;
        System.out.println(factorialCalc.apply(3));
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
