package com.sda.java.generics;

import com.sda.java.inheritance.Car;
import com.sda.java.composition.Door;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford");

        GenericBox<Car> myBox = new GenericBox<>(car);
        GenericBox<Door> myDoor = new GenericBox<>(new Door("gray", "wooden"));

        System.out.println(myBox.getItem().getModel());
        System.out.println(myDoor.getItem().getMaterial());


        ComplexGeneric<Door> myGeneric = new ComplexGeneric<>(new Door("blue","Metal"));
        System.out.println(myGeneric.getItem().getColor());

//
//        Door aDoor = new Door("gray", "wooden");
//        Door bDoor = new Door("blue", "Metal");
//
//        System.out.println(aDoor.compareTo(bDoor));
    }
}
