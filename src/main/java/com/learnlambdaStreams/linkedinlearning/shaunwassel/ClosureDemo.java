package com.learnlambdaStreams.linkedinlearning.shaunwassel;

public class ClosureDemo {

    public static void main(String[] args) {
        NoArgsFunction<NoArgsFunction<String>> createGreetter = () ->{
            String name = "BHARAT";
            return () -> "Namaskar " + name;

        };
   // Concept what i understood is how the greeter have access to the local variable of createGreetter
        NoArgsFunction<String> greeter = createGreetter.applyNoArgs();
        System.out.println(greeter.applyNoArgs());
    }
}
