package com.sda.java.optionals;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String name = null;

        Optional<String> optionalString = Optional.ofNullable(null);
        // ? how to nullify an optional ???

        String value = optionalString.orElse("default value");

        System.out.println(value);
//        System.out.println(name);
//        System.out.println(optionalString.get());
//        optionalString.ifPresent(s-> System.out.println(s));

    }
}
