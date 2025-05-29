package com.pluralsight.ui;

import com.pluralsight.data.IngredientRepository;
import com.pluralsight.items.Ingredient;
import com.pluralsight.items.Sandwich;

import java.util.Scanner;

public class SandwichBuilder {
    private static final Scanner input = new Scanner(System.in);

    public static Sandwich buildSandwich() {
        System.out.print("Enter sandwich size (4, 8, 12): ");
        int size = Integer.parseInt(input.nextLine());

        System.out.print("\nWhite, \nWheat, \nRye, \nWrap \n choose bread type:  ");
        String bread = input.nextLine();

        System.out.print("Toasted? (y/n): ");
        boolean toasted = input.nextLine().equalsIgnoreCase("y");

        Sandwich sandwich = new Sandwich(size, bread, toasted);

        // add meats
//        System.out.println("\nAdd meats (press Enter to skip):");
//        for (Ingredient meat : IngredientRepository.MEATS) {
//            System.out.print("Add " + meat.getName() + "? (y/n): ");
//            if (input.nextLine().equalsIgnoreCase("y")) {
//                sandwich.addIngredient(meat);
//                System.out.print("Want some extra meat? (y/n): ");
//                if (input.nextLine().equalsIgnoreCase("y")) {
//                    for (Ingredient extra : IngredientRepository.EXTRA_MEATS) {
//                        if (extra.getName().contains(meat.getName())) {
//                            sandwich.addIngredient(extra);
//                            break; // prevent to adding multiple extras
//                        }
//                    }
//                }
//            }
//        }

        // add meats
        System.out.println("\nAvailable Meats:");
        for (int i = 0; i < IngredientRepository.MEATS.size(); i++) {
            System.out.println((i + 1) + ". " + IngredientRepository.MEATS.get(i).getName());
        }
        System.out.print("Enter meat numbers separated by commas (e.g., 1,3,5), or press Enter to skip: ");
        String meatInput = input.nextLine();

        if (!meatInput.isBlank()) {
            String[] parts = meatInput.split(",");

            for (String part : parts) {
                int index = Integer.parseInt(part.trim()) - 1;

                if (index >= 0 && index < IngredientRepository.MEATS.size()) {
                    Ingredient meat = IngredientRepository.MEATS.get(index);
                    sandwich.addIngredient(meat);

                    System.out.print("Do you want extra " + meat.getName() + "? (y/n): ");
                    if (input.nextLine().equalsIgnoreCase("y")) {
                        for (Ingredient extra : IngredientRepository.EXTRA_MEATS) {
                            if (extra.getName().contains(meat.getName())) {
                                sandwich.addIngredient(extra);
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Invalid meat number");
                }
            }
        }

        // add cheese
//        System.out.println("\nAdd cheeses:");
//        for (Ingredient cheese : IngredientRepository.CHEESES) {
//            System.out.print("Add " + cheese.getName() + "? (y/n): ");
//            if (input.nextLine().equalsIgnoreCase("y")) {
//                sandwich.addIngredient(cheese);
//                System.out.print("Want some extra cheese? (y/n): ");
//                if (input.nextLine().equalsIgnoreCase("y")) {
//                    for (Ingredient extra : IngredientRepository.EXTRA_CHEESES) {
//                        if (extra.getName().contains(cheese.getName())) {
//                            sandwich.addIngredient(extra);
//                            break;
//                        }
//                    }
//                }
//            }
//        }
        // add cheese
        System.out.println("\nAvailable cheeses");
        for (int i = 0; i < IngredientRepository.CHEESES.size(); i++) {
            System.out.println((i + 1) + ". " + IngredientRepository.CHEESES.get(i).getName());
        }
        System.out.print("Enter cheese numbers separated by commas (e.g., 1,2), or press Enter to skip: ");
        String cheeseInput = input.nextLine();

        if (!cheeseInput.isBlank()) {
            String[] parts = cheeseInput.split(",");

            for (String part : parts) {
                int index = Integer.parseInt(part.trim()) - 1;

                if (index >= 0 && index < IngredientRepository.CHEESES.size()) {
                    Ingredient cheese = IngredientRepository.CHEESES.get(index);
                    sandwich.addIngredient(cheese);

                    System.out.print("Do you want extra " + cheese.getName() + "? (y/n): ");
                    if (input.nextLine().equalsIgnoreCase("y")) {
                        for (Ingredient extra : IngredientRepository.EXTRA_CHEESES) {
                            if (extra.getName().contains(cheese.getName())) {
                                sandwich.addIngredient(extra);
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("Invalid cheese number");
                }
            }
        }


//        // add topping
//        System.out.println("\nAdd regular toppings:");
//        for (Ingredient topping : IngredientRepository.REGULAR_TOPPINGS) {
//            System.out.print("Add " + topping.getName() + "? (y/n): ");
//            if (input.nextLine().equalsIgnoreCase("y")) {
//                sandwich.addIngredient(topping);
//            }
//        }

        // add toppings
        System.out.println("\nAvailable Toppings:");
        for (int i = 0; i < IngredientRepository.REGULAR_TOPPINGS.size(); i++) {
            System.out.println((i + 1) + ". " + IngredientRepository.REGULAR_TOPPINGS.get(i).getName());
        }

        System.out.print("Enter topping numbers separated by commas (e.g., 1,3,5), or press Enter to skip: ");
        String toppingInput = input.nextLine();

        if (!toppingInput.isBlank()) {
            String[] parts = toppingInput.split(",");

            for (String part : parts) {
                int index = Integer.parseInt(part.trim()) - 1;

                if (index >= 0 && index < IngredientRepository.REGULAR_TOPPINGS.size()) {
                    Ingredient topping = IngredientRepository.REGULAR_TOPPINGS.get(index);
                    sandwich.addIngredient(topping);
                } else {
                    System.out.println("Invalid topping number: " + (index + 1));
                }
            }
        }


//        // add sauces
//        System.out.println("\nAdd sauces:");
//        for (Ingredient sauce : IngredientRepository.SAUCES) {
//            System.out.print("Add " + sauce.getName() + "? (y/n): ");
//            if (input.nextLine().equalsIgnoreCase("y")) {
//                sandwich.addIngredient(sauce);
//            }
//        }
        // add sauces
        System.out.println("\nAvailable Sauces:");
        for (int i = 0; i < IngredientRepository.SAUCES.size(); i++) {
            System.out.println((i + 1) + ". " + IngredientRepository.SAUCES.get(i).getName());
        }

        System.out.print("Enter sauce numbers separated by commas (e.g., 2,4), or press Enter to skip: ");
        String sauceInput = input.nextLine();

        if (!sauceInput.isBlank()) {
            String[] parts = sauceInput.split(",");

            for (String part : parts) {
                int index = Integer.parseInt(part.trim()) - 1;

                if (index >= 0 && index < IngredientRepository.SAUCES.size()) {
                    Ingredient sauce = IngredientRepository.SAUCES.get(index);
                    sandwich.addIngredient(sauce);
                } else {
                    System.out.println("Invalid sauce number: " + (index + 1));
                }
            }
        }

        System.out.println("\n Sandwich build!");
        return sandwich;
    }

}
