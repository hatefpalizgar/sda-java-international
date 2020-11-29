package com.sda.java.lambda.example;

public class ThreadInLambda {
    public static void main(String[] args) {

        // Anonymous class
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside an anonymous runnable thread");
            }
        };

        // Lambda expression
        Runnable lambdaRunnable = () ->  System.out.println("Inside a Lambda runnable thread");



    }
}
