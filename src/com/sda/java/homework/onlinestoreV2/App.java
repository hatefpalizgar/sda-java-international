package com.sda.java.homework.onlinestoreV2;

public class App {
    public static void main(String[] args) {
        Product tv  = new Appliance(10, 34);
        Product shoe = new Shoe(4, 13);


        Product book = new Reading(10, 20, "book", "Harry Potter");
        Product mag = new Reading(10, 20, "magazine", "Life");



    }
}
