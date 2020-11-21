package com.sda.java.collections.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineStoreApp {
    static List<Product> availableProducts = new ArrayList<>();
    static List<Product> cart = new ArrayList<>();


    public static void main(String[] args) {

        // making the inventory
        initialize();

        // purchase phase
        purchase(cart);

        viewCart();

        // remove phase
        remove();


        viewCart();

    }

    private static void viewCart() {
        for (Product p : cart) {
            System.out.println(p.getId() + "-" + p.getName());
        }
    }

    private static void remove() {
        System.out.println("Please choose from the list to remove:");
        for (Product p : availableProducts) {
            System.out.println(p.getId() + "-" + p.getName());
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        // find the product using the product id
        Product chosenProduct = findById(choice);
        // remove the found product from the cart
        cart.remove(chosenProduct);
    }

    private static void initialize() {
        Product book = new Product(1, "Book", 34);
        Product tv = new Product(2, "tv", 340);
        Product laptop = new Product(3, "laptop", 800);

        // our small shop inventory of available products
        availableProducts.add(book);
        availableProducts.add(tv);
        availableProducts.add(laptop);
    }

    private static void purchase(List<Product> cart) {
        System.out.println("Please choose from the list to purchase:");
        for (Product p : availableProducts) {
            System.out.println(p.getId() + "-" + p.getName());
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        // find the product using the product id
        Product chosenProduct = findById(choice);
        // add the found product to the cart
        cart.add(chosenProduct);
    }

    private static Product findById(int choice) {
        // iterating over the list of product and check if we have a match id, then return
        // the product associated with that id
        for (Product p : availableProducts) {
            if (p.getId() == choice) {
                return p;
            }
        }
        return null;
    }
}
