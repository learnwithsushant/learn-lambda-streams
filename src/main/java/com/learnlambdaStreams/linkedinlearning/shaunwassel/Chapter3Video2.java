package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chapter3Video2 {

    public static void main(String[] args) {
        Integer [] intArray = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> listOfInt = new ArrayList<>(Arrays.asList(intArray));

        List<Integer> evenNumbers = listOfInt.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);

        Function<Integer, Predicate<String>> wordCountFilter = minlength -> str -> str.length() >minlength;

        Predicate<String> ncharFilter = wordCountFilter.apply(5);

        String [] wordLength = {"one","Three","Seventeenth","ninethith"};
        List<String> wordList = new ArrayList<>(Arrays.asList(wordLength));
        System.out.println("String length greater than 5");
        wordList.stream().filter(ncharFilter).forEach(System.out::println);
    }
}
