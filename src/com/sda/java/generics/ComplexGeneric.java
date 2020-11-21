package com.sda.java.generics;

import com.sda.java.composition.Door;

public class ComplexGeneric<T extends Door> {
    private T item;

    public ComplexGeneric(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
