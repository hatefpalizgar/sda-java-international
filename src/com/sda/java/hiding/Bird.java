package com.sda.java.hiding;

public class Bird extends Animal {
    
    private double weight;
    
    public Bird(double weight) { // new Bird(3)
        this.weight = weight;
    }
    
    // double weight = 3.0
    
    // hidden: int getWeight(){return super.weight}
    
}
