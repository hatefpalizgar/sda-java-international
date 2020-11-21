package com.sda.java.composition;

public class Building {
    private String address;
    private Door door;
    private Parking parking;
    
    public Building(String address, Door door, Parking parking) {
        this.address = address;
        this.door = door;
        this.parking = parking;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public Door getDoor() {
        return door;
    }
    
    public void setDoor(Door door) {
        this.door = door;
    }
    
    public Parking getParking() {
        return parking;
    }
    
    public void setParking(Parking parking) {
        this.parking = parking;
    }
}
