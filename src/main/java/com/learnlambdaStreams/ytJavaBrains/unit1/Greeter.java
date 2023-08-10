package com.learnlambdaStreams.ytJavaBrains.unit1;

public class Greeter {

    public void greet(Greetings greetings){

        greetings.perform();

    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        HelloWorldGreetings helloWorldGreetings = new HelloWorldGreetings();
        greeter.greet(helloWorldGreetings);

        Greetings lambdaExample = () -> System.out.println("Hello From Lambda");

        greeter.greet(lambdaExample);

        lambdaExample.perform();


    }
}
