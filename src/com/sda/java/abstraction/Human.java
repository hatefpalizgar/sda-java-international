package com.sda.java.abstraction;

public abstract class Human {
    public String name;
    public abstract void eat();
    public abstract void breathe();
    
    public void walk() {
        System.out.println("walk method");
    }
}