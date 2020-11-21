package com.sda.java.hiding;

public class Car extends Vehicle{
    private double maxSpeed;
    // hidden: int maxSpeed inherited from Vehicle
    
    public Car(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    // hidden: int getMaxSpeed() inherited from Vehicle
    
    // Solution:
    
    public double getMaxSpeedCar() {
        return this.maxSpeed;
    }
}
