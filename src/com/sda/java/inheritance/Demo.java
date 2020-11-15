package com.sda.java.inheritance;

public class Demo {
    
    public static void main(String[] args) {
        Car aCar = new Car("Ford");
        System.out.println(aCar.getModel());
        aCar.turnOnEngine();
        //aCar.boostSpeed();  Car is not a SportCar
        
        // any instance of SportCar inherits everything from its parent Car class
        // any SportCar is also a Car
        // BUT we can not say any Car is also an SportCar
        SportCar aSportCar = new SportCar("Toyota");
        System.out.println(aSportCar.getModel());
        aSportCar.turnOnEngine();   // any SportCar is also a Car as well
        aSportCar.boostSpeed();
        //
        //
        Computer aComputer = new Computer("Intel", "8", "4");
        aComputer.configure();
        Laptop aLaptop = new Laptop("AMD", "16", "6",16);
        aLaptop.configure();
        
    }
}
