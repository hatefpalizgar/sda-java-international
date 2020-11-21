package com.sda.java.homework.onlinestoreV1.reading;

public class Magazine extends Reading{
    private String coverType;

    public Magazine(String name, int quantity, double unitPrice, String coverType) {
        super(name, quantity, unitPrice);
        this.coverType = coverType;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }
}
