package com.learnlambdaStreams.ytJavaBrains.unit1;

public class RunableLambdaExample {

    public static void main(String[] args) {
        Thread nonLambdaExample = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in non-lambda runnable example");
            }
        });

        nonLambdaExample.run();

        Thread lambdaExample = new Thread(()-> System.out.println("Running in lambda runnable example"));

        lambdaExample.run();
    }
}
