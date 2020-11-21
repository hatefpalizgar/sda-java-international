package com.sda.java.inheritance;

public class SportCar extends Car{  // extends keyword tells java that SportCar inherits from Car
    
    public SportCar(String model) {
        super(model);
    }
    
    public void boostSpeed() {
        System.out.println("invoked boostSpeed() --> SportCar");
    }
    
    @Override
    public void turnOnEngine() {
        System.out.println("invoked turnOnEngine() --> SportCar class");
    }
}
