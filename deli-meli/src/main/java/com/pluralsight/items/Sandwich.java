package com.pluralsight.items;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private int sandwichSize;
    private String breadType;
    private boolean isToasted;
    private List<Ingredient> ingredients;

    public Sandwich(int sandwichSize, String breadType, boolean isToasted) {
        this.sandwichSize = sandwichSize;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.ingredients = new ArrayList<>();
    }

    public int getSize() {
        return sandwichSize;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public String getBreadType() {
        return breadType;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredientByName(String name) {
        for (int i = 0; i < ingredients.size(); i++) {
            if (ingredients.get(i).getName().equalsIgnoreCase(name)) {
                ingredients.remove(i);
                i--; // prevent skipping the next item
            }
        }
    }

    public double calculatePrice() {
        double total = 0;
        if (sandwichSize == 4) total += 5.50;
        else if (sandwichSize == 8) total += 7.00;
        else if (sandwichSize == 12) total += 8.50;

        for (Ingredient i : ingredients) {
            total += i.getPrice(sandwichSize);
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sandwichSize).append("\" ").append(breadType);
        if (isToasted) {
            sb.append(" (Toasted)");
            sb.append("\nIngredients:\n");
        }

        for (Ingredient i : ingredients) {
            sb.append(" - ").append(i.toString()).append("\n");
        }

        sb.append("Total sandwich price: $").append(String.format("%.2f", calculatePrice()));

        return sb.toString(); // converts the StringBuilder into a real String
    }
}
