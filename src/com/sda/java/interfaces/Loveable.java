package com.sda.java.interfaces;

public interface Loveable {
     void love();

     default void someMethod() {

     }

     static int age() {
          return 0;
     }
}
