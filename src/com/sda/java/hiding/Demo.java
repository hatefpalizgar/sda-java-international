package com.sda.java.hiding;

public class Demo {
    
    
    public static void main(String[] args) {
        Car myCar = new Car(150);
        // int maxSpeed inside Vehicle is hiding double maxSpeed inside Car
        // So, never use the same exact name for your methods/fields in class hierarchy
        System.out.println(myCar.getMaxSpeed());
        System.out.println(myCar.getMaxSpeedCar());
        System.out.println("=======================");
        Animal parrot = new Bird(3);
        System.out.println(parrot.getWeight());
    }
    
    
    
}
