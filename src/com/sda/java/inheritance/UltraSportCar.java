package com.sda.java.inheritance;

public class UltraSportCar extends SportCar{
    // UltraSportCar is a SportCar as well
    // UltraSportCar is a Car as well. Car is grandparent of the UltraSportCar
    
    private String nitrogenType;
    
    public UltraSportCar(String model, String nitrogenType) {
        super(model);
        this.nitrogenType = nitrogenType;
    }
    
    public String getNitrogenType() {
        return nitrogenType;
    }
}
