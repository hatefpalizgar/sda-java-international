package com.sda.java.homework.onlinestoreV1.reading;

public class Book extends Reading {
    private String author;

    public Book(String name, int quantity, double unitPrice, String author) {
        super(name, quantity, unitPrice);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
