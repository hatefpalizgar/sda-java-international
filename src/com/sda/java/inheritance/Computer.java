package com.sda.java.inheritance;

public class Computer {     // parent / superclass
    private String cpu;
    private String ram;
    private String gpu;
    
    public Computer(String cpu, String ram, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.gpu = gpu;
    }
    
    public void configure() {
        System.out.println("Booting...");
        System.out.println("Configure cpu: " + cpu);
        System.out.println("Configre ram: " + ram);
        System.out.println("Configre gpu: " + gpu);
    }
}



class Laptop extends Computer {      // child / subclass
    private int battery;
    public Laptop(String cpu, String ram, String gpu, int battery) {
        super(cpu, ram, gpu);
        this.battery = battery;
    }
    
    @Override           // the logic for Laptop overwrites/changes the logic for Computer
    public void configure() {
        System.out.println("Laptop configuration is loading ....");
    }
    
    
}

