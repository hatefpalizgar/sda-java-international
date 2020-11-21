package com.sda.java.interfaces;

public class Dog extends Animal implements Loveable{
    private String collarShape;

    public Dog(int age, String collarShape) {
        super(age);
        this.collarShape = collarShape;
    }

    public String getCollarShape() {
        return collarShape;
    }

    @Override
    public void love() {
        System.out.println("showing love to a dog");
    }
}
