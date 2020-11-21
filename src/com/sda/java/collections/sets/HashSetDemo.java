package com.sda.java.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        travelRoute.add("Barcelona");
        travelRoute.add("Barcelona");


        for (String s : travelRoute) {
            System.out.println(s);
        }

        /*  -Create a set of colors (strings).
            -put duplicate values as well.
            -try to remove some elements from your set.
            -print the list of all elements.*/
        Set<String> colors = new HashSet<>();
        colors.add("Blue");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Violet");
        colors.add("Red");
        colors.add("Black");
        colors.add("Black");

        colors.remove("Black");

        for (String s : colors) {
            System.out.println(s);
        }
    }
}
