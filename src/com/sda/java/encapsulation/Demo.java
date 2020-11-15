package com.sda.java.encapsulation;

public class Demo {
    
    public static void main(String[] args) {
        Dog aDog = new Dog();
        Dog bDog = new Dog('f',"Bulldog");
        Dog cDog = new Dog("Pug", 1, 'f', "Pitbull", 2.5);
        System.out.println("====== aDog ======");
        System.out.println(aDog.toString());
        System.out.println("====== bDog ======");
        System.out.println(bDog.toString());
        System.out.println("====== cDog ======");
        System.out.println(cDog.toString());
    
    }
}
