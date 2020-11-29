package com.sda.java.lambda.example.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class exercise1 {
    public static void main(String[] args) {

        // Create a class called Employee with fields: name(String) and age(int)
        // Inside main method create 3 Employee instances
        // Put all of employees created above inside a List<Employee> (you can use ArrayList as implementation)
        // Now, create another method in exercise1 class with below signature:
        // printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition)
        // So, this method gets the list of employees and prints their name based on ageCondition predicate

        // for example:
        // printEmployeesByAge(employees, "Employees over 30", employee.getAge() > 30)


        // Start now. We will solve it after you solved it....

        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(snow);
        employees.add(charming);
        employees.add(red);


        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "Employees 30 and under", employee -> employee.getAge() <= 30);

        // traditional way | without Lambda expression
        printEmployeesByAge(employees,"Employees over 30", new AgeConditionOverThirty());
    }

    public static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        // goal: check each employee age to meet the condition imposed by ageCondition predicate
        // if they met the condition, then print them out
        System.out.println(ageText);
        System.out.println("================");
        for (Employee e : employees) {
            if (ageCondition.test(e)) {
                System.out.println(e.getName());
            }
        }
    }

}

class AgeConditionOverThirty implements Predicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge()> 30;
    }
}

class AgeConditionBelowThirty implements Predicate<Employee> {
    @Override
    public boolean test(Employee employee) {
        return employee.getAge()<= 30;
    }
}
