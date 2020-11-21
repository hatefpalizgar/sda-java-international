package com.sda.java.enums;

public enum Weight {
    GRAM(1000,"metrics"),
    KILOGRAM(1,"Imperial");

     double value;
     String type;

    Weight(double value, String type) {
        this.value = value;
        this.type = type;
    }
}
