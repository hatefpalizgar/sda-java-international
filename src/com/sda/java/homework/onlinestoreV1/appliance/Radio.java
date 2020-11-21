package com.sda.java.homework.onlinestoreV1.appliance;

public class Radio extends Appliance {
    private String model;
    private int numOfFrequency;

    public Radio(String name, int quantity, double unitPrice, String model, int numOfFrequency) {
        super(name, quantity, unitPrice);
        this.model = model;
        this.numOfFrequency = numOfFrequency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfFrequency() {
        return numOfFrequency;
    }

    public void setNumOfFrequency(int numOfFrequency) {
        this.numOfFrequency = numOfFrequency;
    }
}
