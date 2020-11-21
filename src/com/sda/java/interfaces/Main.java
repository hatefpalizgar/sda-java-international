package com.sda.java.interfaces;

public class Main {
    public static void main(String[] args) {
        Loveable anna = new Girl("White","Anna");
        Loveable rex = new Dog(2,"Circular");

        // we abstracted away the love implementation from its definiton
        // in other words, we separated HOW from WHAT
        // WHAT: love ()
        // HOW: the implemenation of the love()



        showLove(anna);
        showLove(rex);



        //we can not call static methods on instance objects.
        //anna.age();

        anna.someMethod();



        Dog woopy = new Dog(3,"Circular");
        System.out.println(woopy.getAge());

    }


    public static void showLove(Loveable o){
        o.love();
    }


}

