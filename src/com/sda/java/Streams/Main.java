package com.sda.java.Streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.sda.java.Streams.Person;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Thomas", "Peterson", 30);
        Person b = new Person("Thomas", "Blau", 45);
        Person c = new Person("Henry", "Smith", 23);
        Person d = new Person("Mike", "Doe", 25);
        Person e = new Person("Mary", "Williams", 58);

        List<Person> applicants = Arrays.asList(a, b, c, d, e);

        // scenario: get the averageAge of people named Thomas

        // first solution: prior to java 8

        int avg = 0;
        int sum= 0;
        int counter = 0;
        for (Person p : applicants) {

            if (p.getFirstName().equals("Thomas")) {
                counter++;
                sum = sum + p.getAge();
            }
        }// end of for loop

        avg = sum/counter;


        // second solution: post java 8 - using Streams API
        Stream<Person> applicantsStream = applicants.stream();

        List<Integer> ages =  applicantsStream
                .filter(p -> p.getFirstName().equals("Thomas"))
                .map(p->p.getAge())
                .collect(Collectors.toList());


        applicants.stream()
                .sorted((p1,p2)-> p1.getLastName().compareTo(p2.getLastName()))
                .forEach(p-> System.out.println(p.getLastName()));


    }
}
