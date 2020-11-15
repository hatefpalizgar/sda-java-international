package com.sda.java.encapsulation;

public class Demo {
    
    public static void main(String[] args) {
        Pocket aPocket = new Pocket(4000);
        System.out.println(aPocket.getMoney());
        aPocket.setMoney(5000);
        System.out.println(aPocket.getMoney());
       
        Pocket bPocket = new Pocket(5);
        System.out.println(bPocket.getMoney());
    }
}
