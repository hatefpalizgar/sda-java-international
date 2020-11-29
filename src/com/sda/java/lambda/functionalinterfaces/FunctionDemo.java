package com.sda.java.lambda.functionalinterfaces;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // using Lambda expression
        Function<String, Integer> myFunction = text -> text.length();
        System.out.println(myFunction.apply("Hello World!"));

        // without Lambda expression
        Function<String, Integer> myFunc = new MyFunctionImplementation();
        System.out.println(myFunc.apply("Hello World!"));

    }
}


class MyFunctionImplementation implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
