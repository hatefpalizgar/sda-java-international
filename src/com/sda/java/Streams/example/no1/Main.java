package com.sda.java.Streams.example.no1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 40);
        Employee jack = new Employee("Jack Hill", 39);
        Employee snow = new Employee("Snow White", 35);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

       /* // use Streams API to print the employees in each department
        departments.stream() // make an stream out of departments
                .map(department -> department.getEmployees()) // convert each department to its list of employees
                .forEach( // for each list of employees do below
                        employees -> employees.forEach(employee -> System.out.println(employee.getName())) // for each employee get the employee name
                );

        // second solution:
        departments.stream()
                .flatMap(department -> department.getEmployees().stream()).forEach(e-> System.out.println(e.getName()));*/


        // use Streams API to create a Map<Integer,List<Employee>> that groups employees by their age e.g: [30, {e1,e2,e3}]
        Map<Integer, List<Employee>> groupedByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));


        // what is the goal of below code? to print the name of the oldest employee
        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() > e2.getAge() ? e1 : e2)  // reduce the stream to only elements that satisfy the condition
                .ifPresent(e-> System.out.println(e.getName()));
    }
}
