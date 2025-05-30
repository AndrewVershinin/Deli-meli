package com.pluralsight.ui;

import com.pluralsight.items.*;
import com.pluralsight.service.ReceiptService;

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
                    Sandwich sandwich = SandwichBuilder.buildSandwich();
                    order.addSandwich(sandwich);
                    System.out.println("Sandwich added!");
                    break;
                case "2":
                    System.out.print("Would you like to add a drink? (y/n): ");
                    if (input.nextLine().equalsIgnoreCase("y")) {
                        Drink drink = buildDrink();
                        order.addDrink(drink);
                    }
                    System.out.println("Drink added!");
                case "3":
                    System.out.print("Would you like to add chips? (y/n): ");
                    if (input.nextLine().equalsIgnoreCase("y")) {
                        Chips chips = buildChips();
                        order.addChips(chips);
                    }
                    System.out.println("Chips added!");
                case "4":
                    System.out.println("\nFinal Order:");
                    System.out.println(order);
                    System.out.print("\nBonus question! Who was the first man in space? ");
                    String answer = input.nextLine();

                    boolean correct = answer.trim().equalsIgnoreCase("Gagarin");

                    double total = order.calculateTotal();
                    double discounted = correct ? total * 0.9 : total;

                    System.out.printf("Full Order Price: $%.2f\n", total);

                    if (correct) {
                        System.out.println("Correct! You get 10% off.");
                        System.out.printf("Discounted Total: $%.2f\n", discounted);
                    } else {
                        System.out.println("Nope! No discount this time.");
                    }

// Save receipt with full + discounted prices
                    ReceiptService.saveOrderToFile(order, total, discounted);
                    return;
                case "0":
                    System.out.println("Order canceled");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private static Drink buildDrink() {
        System.out.print("Enter drink flavor: ");
        String flavor = input.nextLine();

        System.out.print("Size? (12, 16, 20 oz): ");
        int size = Integer.parseInt(input.nextLine());

        return new Drink(flavor, size);
    }

    private static Chips buildChips() {
        System.out.print("Enter chip type (BBQ, Sour Cream, Classic): ");
        String type = input.nextLine();
        return new Chips(type);
    }
}
