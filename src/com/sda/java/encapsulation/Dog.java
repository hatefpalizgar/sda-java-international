package com.sda.java.encapsulation;
public class Dog {
    private String name = "Rex";
    private int age = 2;
    private char gender = 'm';
    private String race = "Husky";
    private double weight = 3.0;
    
    public Dog() {
    }
    
    public Dog(String name, int age, char gender, String race, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }
    
    public Dog(char gender, String race) {
        super();
        this.gender = gender;
        this.race = race;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Dog {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
