package com.sda.java.lambda;


import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();


        // Anonymous class
        // an interface implementation without any class name

        Animal anonymousDog = new Animal() {
            @Override
            public void eat() {
                System.out.println("my anonymous dog is eating");
            }
        };


        // Lambda expression
        Animal lambdaDog = () -> System.out.println("Lambda Dog is eating");






    }
}

// An interface with only ONE ABSTRACT method and zero/more default methods
@FunctionalInterface
interface Animal {
    void eat();
}


class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("dog is eating the food");
    }
}