package com.learnlambdaStreams.ytJavaBrains.unit3;

public class MethodReferenceExample1 {
    public static void main(String[] args) {

        Thread executor = new Thread(() -> printMessage());
        executor.run();
        // () -> printMessage() is equivament to method reference as below

        Thread methodRefExecutor = new Thread(MethodReferenceExample1::printMessage);
        methodRefExecutor.run();

    }

    public static void printMessage(){

        System.out.println("Hello Lambda Learners");
    }
}
