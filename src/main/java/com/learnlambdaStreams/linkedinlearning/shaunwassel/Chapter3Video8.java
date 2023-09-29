package com.learnlambdaStreams.linkedinlearning.shaunwassel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter3Video8 {

    public static void main(String[] args) {
        String [] wordLength = {"one","Three","Seventeenth","ninethith","Two","four","eleven"};
        List<String> wordList = new ArrayList<>(Arrays.asList(wordLength));

        List<String> processedWord = wordList.parallelStream()
                .map(word -> {
                    System.out.println("Processing Words :"+word);
                    return word.toUpperCase();
                })
                .map(word ->{
                    System.out.println("Processing uppercase word: "+word);
                    return word + "!";
                })
                .collect(Collectors.toList());

        processedWord.forEach(System.out::println);
    }
}
