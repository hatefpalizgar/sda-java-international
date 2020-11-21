package com.sda.java.abstraction;

// concrete class
public class Demo {
    public static void main(String[] args) {
        
        // we can not instantiate abstract classes
        // MyAbstractClass myAbstractClass = new MyAbstractClass("someName");
        
        MyConcreteClass myConcreteClass = new MyConcreteClass();
        
        MyAbstractClass myConcreteClass2 = new MyConcreteClass();
        
    }
}


