package com.pluralsight.ui;

import com.pluralsight.items.*;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner input = new Scanner(System.in);

    public static void displayHomeScreen() {
        while (true) {
            System.out.println("\nWelcome to Deli-Meli!");
            System.out.println("1. New Order");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            String userChoice = input.nextLine();

            switch (userChoice) {
                case "1":
                    startNewOrder();
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public static void startNewOrder() {
        Order order = new Order();

        while (true) {
            System.out.println("\nOrder Menu");
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");
            System.out.print("Choose: ");
            String userChoice = input.nextLine();

            switch (userChoice) {
                case "1":
                    S
            }
        }
    }
}
