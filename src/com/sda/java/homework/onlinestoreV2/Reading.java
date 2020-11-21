package com.sda.java.homework.onlinestoreV2;

public class Reading extends Product{
    private String type;
    private String name;

    public Reading(int quanity, double unitPrice, String type, String name) {
        super(quanity, unitPrice);
        this.type = type;
        this.name = name;
    }
}
