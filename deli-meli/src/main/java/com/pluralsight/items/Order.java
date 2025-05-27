package com.pluralsight.items;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public double calculateTotal() {
        double total = 0;

        for (Sandwich s : sandwiches) {
            total += s.calculatePrice();
        }

        for (Drink d : drinks) {
            total += d.getPrice();
        }

        for (Chips c : chips) {
            total += c.getPrice();
        }

        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDELI-MELI ORDER SUMMARY\n\n");

        for (int i = 0; i < sandwiches.size(); i++) {
            sb.append("Sandwich ").append(i + 1).append(":\n");
            sb.append(sandwiches.get(i).toString()).append("\n\n");
        }

        for (Drink d : drinks) {
            sb.append("Drink: ").append(d.toString()).append("\n");
        }

        for (Chips c : chips) {
            sb.append("Chips: ").append(c.toString()).append("\n");
        }

        sb.append("\nTotal Order Price: $")
                .append(String.format("%.2f", calculateTotal()));

        return sb.toString();
    }
}
