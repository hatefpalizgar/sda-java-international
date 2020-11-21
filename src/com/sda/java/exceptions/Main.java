package com.sda.java.exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{1,2,3};

        Calculator calc = new Calculator();

        try {
            // the code that throws the exception
            calc.divide(array[32], 0);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getClass().getName());
//            exception.printStackTrace();
        } catch (ArithmeticException ex){
            System.out.println("ArrayIndexOutOfBounds were caught correctly");;
        }

        finally {
            // no matter exception is thrown/not this block would be executed all the time
            System.out.println("Inside finally block, after exception is thrown");
        }

        System.out.println("Exception is caught and program execution didn't crash");


        // ===================== throw an exception ==================

        try {
            calc.diff(10, 20);
        } catch (MyCustomException exception) {

            exception.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        try {
            // opening a resource to system
            int a = scanner.nextInt();
            int b = scanner.nextInt();  // 0
            int result = a/b;
            System.out.println("If b==0 then exception is thrown, this line never gonna print");
            System.out.println("If b==0 then exception is thrown, our scanner resource is not closed");
        }catch (Exception ex){
            // if exception is thrown, we should close the resource manually
            scanner.close();
            ex.printStackTrace();
        }


        // auto-closable try-with-resources
        try (Scanner scanner1 = new Scanner(System.in)) {

        }
    }
}
