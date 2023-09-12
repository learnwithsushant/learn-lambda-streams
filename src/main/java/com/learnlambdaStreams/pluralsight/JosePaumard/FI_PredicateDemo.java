package com.learnlambdaStreams.pluralsight.JosePaumard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FI_PredicateDemo {
    //Predicate is used in filter operation in Stream API
    public static void main(String[] args) {
        Predicate<String> lengthChecker = s ->  s.isEmpty();
        System.out.println("Length Checker "+ lengthChecker.test("Python"));

        List<String> carBrands = new ArrayList<>(List.of("TATA","Maruti","KIA","MAHINDRA"));
        Predicate<String> nameFilter = s -> !s.startsWith("M");
        carBrands.removeIf(nameFilter);
        Consumer<String> consumer = s -> System.out.println(s);
        carBrands.forEach(consumer);

        /* Experienced lambda coding persion will write in this way
        *
        * carBrands.removeIf(s -> !s.startsWith("M"));
        * carBrands.forEach(s -> System.out.println(s));
        *
        * */

    }
}
