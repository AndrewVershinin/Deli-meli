package com.pluralsight;

import com.pluralsight.items.*;

public class DeliMeliApp {
    public static void main(String[] args) {

        Order order = new Order();

        Sandwich sandwich = new Sandwich(8, "Wheat", true);
        sandwich.addIngredient(new Ingredient("Ham", "Meat", false, 1.00, 2.00, 3.00));
        sandwich.addIngredient(new Ingredient("Cheddar", "Cheese", false, 0.75, 1.50, 2.25));
        order.addSandwich(sandwich);

        Drink drink = new Drink("Cola", 16);
        order.addDrink(drink);

        Chips chips = new Chips("BBQ");
        order.addChips(chips);

        System.out.println(order);
    }
}
