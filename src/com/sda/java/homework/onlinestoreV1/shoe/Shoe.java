package com.sda.java.homework.onlinestoreV1.shoe;

import com.sda.java.homework.onlinestoreV1.Product;

public abstract class Shoe extends Product {
    private int size;

    public Shoe(String name, int quantity, double unitPrice, int size) {
        super(name, quantity, unitPrice);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
