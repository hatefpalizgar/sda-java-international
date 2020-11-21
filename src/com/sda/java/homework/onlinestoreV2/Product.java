package com.sda.java.homework.onlinestoreV2;

public abstract class Product {
    private int quanity;
    private double unitPrice;

    public Product(int quanity, double unitPrice) {
        this.quanity = quanity;
        this.unitPrice = unitPrice;
    }

    public int getQuanity() {
        return quanity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
