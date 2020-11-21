package com.sda.java.exceptions;

public class Calculator {

    public int divide(int a, int b) {
        return a/b;
    }

    public int diff (int a, int b) throws MyCustomException {
        if (a >= b) {
            return a-b;
        }else{
         throw new MyCustomException("A should be greater equal than B");
        }
    }
}
