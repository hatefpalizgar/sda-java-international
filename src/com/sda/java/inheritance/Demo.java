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
        //
        //
        Car bSportCar = new SportCar("Subaru");
        
        bSportCar.turnOnEngine();
       // bSportCar.boostSpeed();  this is not possible
        System.out.println(bSportCar.getModel());
        //
        //
        Car cSportCar = new UltraSportCar("Peugeot", "Nitro-123");
        // cSportCar.getNitrogenType(); this is not possible
        System.out.println("====================== POLYMORPHISM ===================");
        igniteEngine(bSportCar);
        igniteEngine(cSportCar);
        System.out.println("====================== NO-POLYMORPHISM ===================");
        UltraSportCar cSportCar2 = new UltraSportCar("Peugeot", "Nitro-123");
        SportCar bSportCar2 = new SportCar("Subaru");
        igniteEngine(cSportCar2);
        igniteEngine(bSportCar2);
    }
    
    // since SportCar and UltraSportCar are subclasses of Car, they can have both type at the same time
    // for example: bSportCar2 is either of type Car or of type SportCar
    // POLY-MORPHISM
    
    public static void igniteEngine(Car someCar) {
        someCar.turnOnEngine();
    }
  
}
