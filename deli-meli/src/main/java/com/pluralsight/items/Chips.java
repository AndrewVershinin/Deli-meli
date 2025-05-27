package com.pluralsight.items;

public class Chips {
    private String type;

    public Chips(String type) {
        this.type = type;
    }

    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return type + " Chips ($1.50)";
    }
}
