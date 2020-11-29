package com.sda.java.lambda.example;

import com.sda.java.collections.maps.Person;

import java.util.function.Predicate;

public class LambdaDemo {
    public static void main(String[] args) {
        Person andyMurray = new Person("Andy", "Murray", 30);

        // Traditional way of calling interface concerete implementation's method
        AdultPersonTest adultPersonTest = new AdultPersonTest();
        System.out.println(adultPersonTest.test(andyMurray));


        // Using anonymous class
        System.out.println(
                new Predicate() {
                    @Override
                    public boolean test(Object o) {
                        return ((Person) o).getAge() >= 18;
                    }
                }.test(andyMurray)
        );


        // Using Lambda Expression
        Predicate<Person> lambdaPersonTest = (p) -> p.getAge() >= 18;
        System.out.println(lambdaPersonTest.test(andyMurray));


        // Using Method Reference ::
        // because isAdult method follows the same signature as Predicate test method, I can reference that as well
        Predicate<Person> methodReferencePersonTest = Person::isAdult;
        // Using Lambda
        Predicate<Person> lambdaInsteadOfMethodReferencePersonTest = p -> p.getAge() > 30;
    }
}


class AdultPersonTest implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.getAge() >= 18;
    }
}
