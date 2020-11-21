package com.sda.java.inheritance;

public class Car {
    private String model;
    
    public Car(String model) {
        this.model = model;
    }
    
    public void turnOnEngine() {
        System.out.println("invoked turnOnEngine() --> Car class");
    }
    
    public String getModel() {
        return model;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
