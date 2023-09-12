package com.learnlambdaStreams.pluralsight.JosePaumard;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class PrimitivesLambda {
    public static void main(String[] args) {
        IntSupplier randonIntGen = ()-> ThreadLocalRandom.current().nextInt(0, 99 + 1);
        System.out.println("Randon no. generated"+ randonIntGen.getAsInt());

        DoubleToIntFunction doubleToIntFunction = v-> (int)Math.floor(v);
        System.out.println("Integer Value"+ doubleToIntFunction.applyAsInt(3.45));

        IntPredicate intPredicate = i-> i%2==0;
        System.out.println("Is even no."+intPredicate.test(21));

        LongSupplier longSupplier = ()-> ThreadLocalRandom.current().nextLong(1,99);
        System.out.println("Long Supplier "+longSupplier.getAsLong());
    }
}
