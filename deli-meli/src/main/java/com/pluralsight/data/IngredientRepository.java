package com.pluralsight.data;

import com.pluralsight.items.Ingredient;
import com.pluralsight.items.constants.BreadType;
import com.pluralsight.items.constants.IngredientType;

import java.util.ArrayList;
import java.util.List;

public class IngredientRepository {
    // store ingredients
    public static final List<Ingredient> BREADS = new ArrayList<>();
    public static final List<Ingredient> MEATS = new ArrayList<>();
    public static final List<Ingredient> EXTRA_MEATS = new ArrayList<>();
    public static final List<Ingredient> CHEESES = new ArrayList<>();
    public static final List<Ingredient> EXTRA_CHEESES = new ArrayList<>();
    public static final List<Ingredient> REGULAR_TOPPINGS = new ArrayList<>();
    public static final List<Ingredient> SAUCES = new ArrayList<>();
    public static final List<Ingredient> SIDES = new ArrayList<>();

    static {
        // BREADS
        BREADS.add(new Ingredient(BreadType.WHITE, IngredientType.BREAD, false, 5.50, 7.00, 8.50));
        BREADS.add(new Ingredient(BreadType.WHEAT, IngredientType.BREAD, false, 5.50, 7.00, 8.50));
        BREADS.add(new Ingredient(BreadType.RYE, IngredientType.BREAD, false, 5.50, 7.00, 8.50));
        BREADS.add(new Ingredient(BreadType.WRAP, IngredientType.BREAD, false, 5.50, 7.00, 8.50));

        // MEATS
        MEATS.add(new Ingredient("Steak", IngredientType.MEAT, false, 1.00, 2.00, 3.00));
        MEATS.add(new Ingredient("Ham", IngredientType.MEAT, false, 1.00, 2.00, 3.00));
        MEATS.add(new Ingredient("Salami", IngredientType.MEAT, false, 1.00, 2.00, 3.00));
        MEATS.add(new Ingredient("Roast Beef", IngredientType.MEAT, false, 1.00, 2.00, 3.00));
        MEATS.add(new Ingredient("Chicken", IngredientType.MEAT, false, 1.00, 2.00, 3.00));
        MEATS.add(new Ingredient("Bacon", IngredientType.MEAT, false, 1.00, 2.00, 3.00));

        // EXTRA MEAT
        EXTRA_MEATS.add(new Ingredient("Extra Steak", IngredientType.EXTRA_MEAT, true, 0.50, 1.00, 1.50));
        EXTRA_MEATS.add(new Ingredient("Extra Ham", IngredientType.EXTRA_MEAT, true, 0.50, 1.00, 1.50));
        EXTRA_MEATS.add(new Ingredient("Extra Salami", IngredientType.EXTRA_MEAT, true, 0.50, 1.00, 1.50));
        EXTRA_MEATS.add(new Ingredient("Extra Roast Beef", IngredientType.EXTRA_MEAT, true, 0.50, 1.00, 1.50));
        EXTRA_MEATS.add(new Ingredient("Extra Chicken", IngredientType.EXTRA_MEAT, true, 0.50, 1.00, 1.50));
        EXTRA_MEATS.add(new Ingredient("Extra Bacon", IngredientType.EXTRA_MEAT, true, 0.50, 1.00, 1.50));

        // CHEESE
        CHEESES.add(new Ingredient("Cheddar", IngredientType.CHEESE, false, 0.75, 1.50, 2.25));
        CHEESES.add(new Ingredient("American", IngredientType.CHEESE, false, 0.75, 1.50, 2.25));
        CHEESES.add(new Ingredient("Provolone", IngredientType.CHEESE, false, 0.75, 1.50, 2.25));
        CHEESES.add(new Ingredient("Swiss", IngredientType.CHEESE, false, 0.75, 1.50, 2.25));

        // EXTRA CHEESE
        EXTRA_CHEESES.add(new Ingredient("Extra Cheddar", IngredientType.EXTRA_CHEESE, true, 0.30, 0.60, 0.90));
        EXTRA_CHEESES.add(new Ingredient("Extra American", IngredientType.EXTRA_CHEESE, true, 0.30, 0.60, 0.90));
        EXTRA_CHEESES.add(new Ingredient("Extra Provolone", IngredientType.EXTRA_CHEESE, true, 0.30, 0.60, 0.90));
        EXTRA_CHEESES.add(new Ingredient("Extra Swiss", IngredientType.EXTRA_CHEESE, true, 0.30, 0.60, 0.90));

        // REGULAR TOPPINGS
        REGULAR_TOPPINGS.add(new Ingredient("Lettuce", IngredientType.REGULAR, false, 0, 0, 0));
        REGULAR_TOPPINGS.add(new Ingredient("Tomatoes", IngredientType.REGULAR, false, 0, 0, 0));
        REGULAR_TOPPINGS.add(new Ingredient("Onions", IngredientType.REGULAR, false, 0, 0, 0));
        REGULAR_TOPPINGS.add(new Ingredient("Peppers", IngredientType.REGULAR, false, 0, 0, 0));
        REGULAR_TOPPINGS.add(new Ingredient("Pickles", IngredientType.REGULAR, false, 0, 0, 0));
        REGULAR_TOPPINGS.add(new Ingredient("Jalapeños", IngredientType.REGULAR, false, 0, 0, 0));
        REGULAR_TOPPINGS.add(new Ingredient("Cucumbers", IngredientType.REGULAR, false, 0, 0, 0));
        REGULAR_TOPPINGS.add(new Ingredient("Guacamole", IngredientType.REGULAR, false, 0, 0, 0));
        REGULAR_TOPPINGS.add(new Ingredient("Mushrooms", IngredientType.REGULAR, false, 0, 0, 0));

        // SAUCES
        SAUCES.add(new Ingredient("Mayo", IngredientType.SAUCE, false, 0, 0, 0));
        SAUCES.add(new Ingredient("Mustard", IngredientType.SAUCE, false, 0, 0, 0));
        SAUCES.add(new Ingredient("Ketchup", IngredientType.SAUCE, false, 0, 0, 0));
        SAUCES.add(new Ingredient("Ranch", IngredientType.SAUCE, false, 0, 0, 0));
        SAUCES.add(new Ingredient("Thousand Islands", IngredientType.SAUCE, false, 0, 0, 0));
        SAUCES.add(new Ingredient("Vinaigrette", IngredientType.SAUCE, false, 0, 0, 0));

        // SIDES
        SIDES.add(new Ingredient("Au Jus", IngredientType.SIDE, false, 0, 0, 0));
        SIDES.add(new Ingredient("Special Sauce", IngredientType.SIDE, false, 0, 0, 0));
    }
}
