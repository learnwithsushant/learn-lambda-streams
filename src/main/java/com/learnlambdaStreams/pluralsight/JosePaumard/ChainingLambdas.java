package com.learnlambdaStreams.pluralsight.JosePaumard;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambdas {

    public static void main(String[] args) {
        Consumer<String> c1 = c-> System.out.println("Print to UpperCase"+c.toUpperCase());
        Consumer<String> c2 = c-> System.out.println("Print to Lower"+c.toLowerCase());

        Consumer<String> c3 = c1.andThen(c2);

        c3.accept("First to upper and then to lower");

        Consumer<Integer> i1 = i-> System.out.println("First Square: "+(int)i*i);
        Consumer<Integer> i2 = i-> System.out.println("then cube : "+(int)i*i*i);

        Consumer<Integer> i3 = i1.andThen(i2);

        i3.accept(5);

        Predicate<String> isNull = s -> s==null;
        Predicate<String> isEmpty = s -> s.isEmpty();
        Predicate<String> emptyAndNullCheck = isNull.negate().and(isEmpty.negate());

        System.out.println("FOr null value"+emptyAndNullCheck.test(null));
        System.out.println("FOr empty value"+emptyAndNullCheck.test(""));
        System.out.println("FOr valid  value"+emptyAndNullCheck.test("G20"));



}
}
