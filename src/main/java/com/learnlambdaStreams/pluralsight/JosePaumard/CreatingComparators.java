package com.learnlambdaStreams.pluralsight.JosePaumard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CreatingComparators {
    public static void main(String[] args) {
        List<String> digits = Arrays.asList("one","two","three","four","five","six","seven","eight","nine","ten");
        Comparator<String> cmp = (s1,s2) -> s1.compareTo(s2);
        digits.sort(cmp);
        System.out.println("Comparator Demo"+digits);

        Comparator<String> cmp2 = (s1,s2) -> Integer.compare(s1.length(),s2.length());

        digits.sort(cmp2);
        System.out.println("Compare by length"+digits);

        // Using function
        Function<String,Integer> toLength = s->s.length();
        Comparator<String> cmp3 = Comparator.comparing(toLength);
        digits.sort(cmp3);
        System.out.println("Compare by length"+digits);

        // Using INt2Function

        ToIntFunction<String> byLenth = s->s.length();
        Comparator<String> cmp4 = Comparator.comparingInt(byLenth);
        digits.sort(cmp4);
        System.out.println("Compare by length"+digits);

    }
}
