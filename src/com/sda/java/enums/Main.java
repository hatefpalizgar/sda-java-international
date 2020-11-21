package com.sda.java.enums;

import java.lang.reflect.Array;
import java.util.List;

import static com.sda.java.enums.SimpleUnit.*;

public class Main {
    public static void main(String[] args) {
        String name = "hatef";
        SimpleUnit unit = CENTIMETER;
        System.out.println(unit);
        System.out.println(INCH);
        System.out.println(FOOT);

        ComplexUnit complexUnit = ComplexUnit.INCH;

        double heightInMeters = ComplexUnit.METER.convertToMeters();


        // instead of doing traditionally

        int weightInKilogram = 1;
        int weightInGrams = weightInKilogram * 1000;
        System.out.println("Default Weight in dimension: " + Weight.GRAM.type + ":" + weightInGrams);

        // goal of Enum
        // let's say you have an application that only accepts a predefined(default) set of colors
        // like red, blue, green
        // Developers and Users are not allowed to have any other colors

        String[] color = new String[]{"Red","Blue","Green"};

        System.out.println(Color.BLUE);


        // Write an application that prints weekdays using Enums
        // Also display their corresponding day number (Monday = 1 and so on)
        System.out.println(Weekday.FRIDAY);


        // Write an application for a traffic light that has RED,GREEN, YELLOW with
        // some message to tell the drivers what to do.
        // Simulate a scenario of red light is turned on
        // Show the driver the message
    }
}

enum Weekday {
    SATURDAY(1),
    SUNDAY(2),
    MONDAY(3),
    TUESDAY(4),
    WEDNESDAY(5),
    THURSDAY(6),
    FRIDAY(7);

    int order;

    Weekday(int order) {
        this.order = order;
    }
}
