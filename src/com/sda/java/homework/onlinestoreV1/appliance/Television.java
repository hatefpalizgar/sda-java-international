package com.sda.java.homework.onlinestoreV1.appliance;

public class Television extends Appliance {
    private String model;

    public Television(String name, int quantity, double unitPrice, String model) {
        super(name, quantity, unitPrice);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
