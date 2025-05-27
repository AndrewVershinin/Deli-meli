package com.pluralsight.items;

public class Drink {
    private String flavor;
    private int sizeInOunces;

    public Drink(String flavor, int sizeInOunces) {
        this.flavor = flavor;
        this.sizeInOunces = sizeInOunces;
    }

    public double getPrice() {
        return switch (sizeInOunces) {
            case 12 -> 2.00;
            case 16 -> 2.50;
            case 20 -> 3.00;
            default -> 0;
        };
    }

    @Override
    public String toString() {
        return sizeInOunces + "oz " + flavor + " ($" + String.format("%.2f", getPrice()) + ")";
    }
}
