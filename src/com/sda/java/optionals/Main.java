package com.sda.java.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer someNumber = 5;

       // System.out.println(someNumber+1);

        Optional<Integer> someNumber2 = Optional.ofNullable(someNumber);

        if (someNumber2.isPresent()) {
            System.out.println(someNumber2.get()+1);
        }

        // ifPresent method accepts a consumer [a method receiving input, returning no output]
        someNumber2.ifPresent(System.out::println);

        String fullName = null;
        Optional<String> optionalFullName = Optional.ofNullable(fullName);
        String value = optionalFullName.orElse("default string");
        System.out.println(value);

        // before Java 8 - before Optionals were introduced we write this way:
        if (fullName!= null) {
            System.out.println(fullName);
        } else{
            System.out.println("default value");
        }
    }
}
