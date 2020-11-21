package com.sda.java.aggregation;

public class Student {
    private String name;
    private double weight;
    private Backpack backpack;
    private NoteBook[] noteBooks;  // int[]
    
    public Student(String name, double weight, Backpack backpack, NoteBook[] noteBooks) {
        this.name = name;
        this.weight = weight;
        this.backpack = backpack;
        this.noteBooks = noteBooks;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public Backpack getBackpack() {
        return backpack;
    }
    
    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }
    
    public NoteBook[] getNoteBooks() {
        return noteBooks;
    }
    
    public void setNoteBooks(NoteBook[] noteBooks) {
        this.noteBooks = noteBooks;
    }
}
