package com.sda.java.generics;

public class Door implements Comparable<Door> {
    private String color;
    private String material;


    public Door(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public int compareTo(Door o) {
        return 0;
    }
}
