package com.sda.java.nestedclass;

public class Main {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle();

        System.out.println(myBike.getMaxSpeed());

        // weird way of instantiating an inner class
        // there is no point at instantiating an inner class (it is actually bullshit)
        Bicycle.Wheel aWheel = myBike.new Wheel();


        // calling static nested class
        Bicycle.StaticInnerClass myInnerClass = new Bicycle.StaticInnerClass();
    }
}
