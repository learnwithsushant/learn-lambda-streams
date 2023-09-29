package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chapter3Video4 {

    public static void main(String[] args) {

        Function<Integer, Predicate<String>> wordCountFilter = minlength -> str -> str.length() >minlength;

        Predicate<String> ncharFilter = wordCountFilter.apply(5);

        String [] wordLength = {"one","Three","Seventeenth","ninethith","Two","four","eleven"};
        List<String> wordList = new ArrayList<>(Arrays.asList(wordLength));
        System.out.println("String length greater than 5");
        wordList.stream().filter(ncharFilter).forEach(System.out::println);

        String joiningWords = wordList.stream().filter(ncharFilter).collect(Collectors.joining(":"));
        System.out.println("Joining joiningWords : "+joiningWords);

        Long countOfLongWords = wordList.stream().filter(ncharFilter).collect(Collectors.counting());
        System.out.println("countOfLongWords : "+countOfLongWords);

        Map<Integer,List<String>> mapOfWordLength = wordList.stream().collect(Collectors.groupingBy(
                (word)->word.length()
        ));

        System.out.println("Grouping by demo");
        System.out.println(mapOfWordLength);

        System.out.println("Partitioning demo");

        Map<Boolean,List<String>> mapOfPartition = wordList.stream().collect(Collectors.partitioningBy(
                (word)->word.length()>5
        ));

        System.out.println(mapOfPartition);
    }
}
