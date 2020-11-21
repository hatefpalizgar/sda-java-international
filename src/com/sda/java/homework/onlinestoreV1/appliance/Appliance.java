package com.sda.java.homework.onlinestoreV1.appliance;

import com.sda.java.homework.onlinestoreV1.Product;

public abstract class Appliance extends Product {
    public Appliance(String name, int quantity, double unitPrice) {
        super(name, quantity, unitPrice);
    }
}
