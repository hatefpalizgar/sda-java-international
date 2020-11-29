package com.sda.java.lambda.example;

import com.sda.java.lambda.example.exercise1.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListsInLambda {
    public static void main(String[] args) {
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(snow);
        employees.add(charming);
        employees.add(red);

        // using for loop
        for (Employee e : employees) {
            System.out.println(e.getName());
        }

        // using Lambda and forEach()
        employees.forEach(e-> System.out.println(e.getName()));

        // using Method Reference (NB! this prints the employee NOT the name)
        employees.forEach(System.out::println);

        // using Method Reference
        employees.forEach(ListsInLambda::printName);

    }

    public static void printName(Employee employee) {
        System.out.println(employee.getName());
    }
}