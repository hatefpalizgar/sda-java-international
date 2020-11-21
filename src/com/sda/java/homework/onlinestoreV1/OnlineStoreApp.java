package com.sda.java.homework.onlinestoreV1;

import com.sda.java.homework.onlinestoreV1.appliance.Appliance;
import com.sda.java.homework.onlinestoreV1.appliance.Radio;
import com.sda.java.homework.onlinestoreV1.appliance.Television;
import com.sda.java.homework.onlinestoreV1.reading.Book;
import com.sda.java.homework.onlinestoreV1.reading.Magazine;
import com.sda.java.homework.onlinestoreV1.reading.Reading;
import com.sda.java.homework.onlinestoreV1.shoe.FormalShoe;
import com.sda.java.homework.onlinestoreV1.shoe.Shoe;
import com.sda.java.homework.onlinestoreV1.shoe.SportsShoe;
import com.sda.java.homework.onlinestoreV1.user.Address;
import com.sda.java.homework.onlinestoreV1.user.User;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStoreApp {
    public static void main(String[] args) {
        Appliance sony = new Television("Sony", 5, 350, "S-001");
        Appliance samsung = new Television("Samsung", 10, 187, "SGMH73");
        Appliance hertz = new Radio("Hertz", 13, 45, "HZ7245", 5);
        //
        Reading harryPotter = new Book("Harry Potter", 10, 37, "J. Rolling");
        Reading insider = new Magazine("Insider", 45, 15, "glossy");
        //
        Shoe nike = new SportsShoe("EasyRun", 30, 57, 42, "Nike");
        Shoe dexter = new FormalShoe("ClassyFeet", 35, 70, 38, "Dexter");
        //
        Address address = new Address("London", "Picadilly street", 1234);
        User user = new User("hatef", "password", "hatef", "palizgar"
                , 5901234, "hp@gmail.com", address);
        //
        ArrayList<Product> cart = new ArrayList<>();
        cart.add(sony);
        cart.add(samsung);
        cart.add(hertz);
        cart.add(nike);
        cart.add(dexter);



        Scanner scanner = new Scanner(System.in);

        // Ask the user to choose the type of product from the list: (r)(t)(b)(m)(f)(s)
        System.out.println("Choose Type of product you want to add?");
        String productType = scanner.nextLine();
        productType = productType.substring(0, 1);


        String productName;
        int quantity;
        double price;
        String model;
        int numOfFrequency;

        // add product to the cart

        switch (productType) {
            case "r":
                System.out.println("Enter radio name");
                productName = scanner.nextLine();
                System.out.println("Enter quantity");
                quantity = scanner.nextInt();
                System.out.println("Enter unit price");
                price = scanner.nextDouble();
                System.out.println("Enter model");
                model = scanner.nextLine();
                System.out.println("Enter number of frequency");
                numOfFrequency = scanner.nextInt();
                Radio radio = new Radio(productName, quantity, price, model, numOfFrequency);
                cart.add(radio);

                break;

            case "t":
                System.out.println("Enter tv name");
                productName = scanner.nextLine();
                System.out.println("Enter quantity");
                quantity = scanner.nextInt();
                System.out.println("Enter unit price");
                price = scanner.nextDouble();
                break;

            case "b":
                System.out.println("Enter book name");
                productName = scanner.nextLine();
                System.out.println("Enter quantity");
                quantity = scanner.nextInt();
                System.out.println("Enter unit price");
                price = scanner.nextDouble();
                break;

            case "m":
                System.out.println("Enter magazine name");
                productName = scanner.nextLine();
                System.out.println("Enter quantity");
                quantity = scanner.nextInt();
                System.out.println("Enter unit price");
                price = scanner.nextDouble();
                break;
            case "f":
                System.out.println("Enter formal shoe name");
                productName = scanner.nextLine();
                System.out.println("Enter quantity");
                quantity = scanner.nextInt();
                System.out.println("Enter unit price");
                price = scanner.nextDouble();
                break;

            case "s":
                System.out.println("Enter sports shoe name");
                productName = scanner.nextLine();
                System.out.println("Enter quantity");
                quantity = scanner.nextInt();
                System.out.println("Enter unit price");
                price = scanner.nextDouble();
                break;
        }


// display list of products
        for (Product p : cart) {
            System.out.println(p.toString());
        }

    }
}
