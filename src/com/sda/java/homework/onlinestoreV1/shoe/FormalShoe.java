package com.sda.java.homework.onlinestoreV1.shoe;

public class FormalShoe extends Shoe{
    private String brand;

    public FormalShoe(String name, int quantity, double unitPrice, int size, String brand) {
        super(name, quantity, unitPrice, size);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
