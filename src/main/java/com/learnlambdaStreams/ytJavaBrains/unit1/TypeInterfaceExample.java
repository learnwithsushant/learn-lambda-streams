package com.learnlambdaStreams.ytJavaBrains.unit1;

public class TypeInterfaceExample {

    public static void main(String[] args) {
       /* StringLengthLambda stringLengthLambda = s -> s.length();
        System.out.println(stringLengthLambda.getLength("Life is enjoy !"));*/

        printLambda(s->s.length());
    }

    public static void printLambda(StringLengthLambda l){

        System.out.println(l.getLength("Life is beautiful"));
    }
}



interface StringLengthLambda{

    int getLength(String s);
}
