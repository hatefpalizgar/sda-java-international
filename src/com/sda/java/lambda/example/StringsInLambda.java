package com.sda.java.lambda.example;

import java.util.function.Predicate;

public class StringsInLambda {
    public static void main(String[] args) {
        Predicate<String> myStringPredicate = text -> text.startsWith("ABC");

        System.out.println(myStringPredicate.test("ABCDEF"));

        Predicate<String> emptyPredicate = s -> s.isEmpty();
        System.out.println(emptyPredicate.test(""));


    }
}



