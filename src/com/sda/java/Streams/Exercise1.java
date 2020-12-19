package com.sda.java.Streams;

import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");

        // a: sort the list
//        names.stream().sorted().forEach(System.out::println);

        //b: print only those names that start with 'E' letter
//        names.stream().filter(l -> l.startsWith("E")).forEach(System.out::println);

        //d: print all names in uppercase format
        names.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
    }
}
