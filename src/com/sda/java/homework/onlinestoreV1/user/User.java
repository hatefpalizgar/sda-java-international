package com.sda.java.homework.onlinestoreV1.user;

public class User {

    private String username;
    private String password;
    private String name;
    private String surname;
    private int number;
    private String email;
    private Address address;

    public User(String username, String password, String name, String surname, int number, String email, Address address) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.email = email;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
