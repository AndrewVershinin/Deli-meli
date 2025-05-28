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

        System.out.print("Choose bread type (White, Wheat, Rye, Wrap): ");
        String bread = input.nextLine();

        System.out.print("Toasted? (y/n): ");
        boolean toasted = input.nextLine().equalsIgnoreCase("y");

        Sandwich sandwich = new Sandwich(size, bread, toasted);

        // add meats
        System.out.println("\nAdd meats (press Enter to skip):");
        for (Ingredient meat : IngredientRepository.MEATS) {
            System.out.print("Add " + meat.getName() + "? (y/n): ");
            if (input.nextLine().equalsIgnoreCase("y")) {
                sandwich.addIngredient(meat);
                System.out.print("Want some extra meat? (y/n): ");
                if (input.nextLine().equalsIgnoreCase("y")) {
                    for (Ingredient extra : IngredientRepository.EXTRA_MEATS) {
                        if (extra.getName().contains(meat.getName())) {
                            sandwich.addIngredient(extra);
                            break; // prevent to adding multiple extras
                        }
                    }
                }
            }
        }
        // add cheese
        System.out.println("\nAdd cheeses:");
        for (Ingredient cheese : IngredientRepository.CHEESES) {
            System.out.print("Add " + cheese.getName() + "? (y/n): ");
            if (input.nextLine().equalsIgnoreCase("y")) {
                sandwich.addIngredient(cheese);
                System.out.print("Want some extra cheese? (y/n): ");
                if (input.nextLine().equalsIgnoreCase("y")) {
                    for (Ingredient extra : IngredientRepository.EXTRA_CHEESES) {
                        if (extra.getName().contains(cheese.getName())) {
                            sandwich.addIngredient(extra);
                            break;
                        }
                    }
                }
            }
        }
        // add toppings
        System.out.println("\nAdd regular toppings:");
        for (Ingredient topping : IngredientRepository.REGULAR_TOPPINGS) {
            System.out.print("Add " + topping.getName() + "? (y/n): ");
            if (input.nextLine().equalsIgnoreCase("y")) {
                sandwich.addIngredient(topping);
            }
        }
        // add sauces
        System.out.println("\nAdd sauces:");
        for (Ingredient sauce : IngredientRepository.SAUCES) {
            System.out.print("Add " + sauce.getName() + "? (y/n): ");
            if (input.nextLine().equalsIgnoreCase("y")) {
                sandwich.addIngredient(sauce);
            }
        }

        System.out.println("\n Sandwich build!");
        return sandwich;
    }

}
