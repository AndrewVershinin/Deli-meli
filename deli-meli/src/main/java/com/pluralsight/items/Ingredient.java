package com.pluralsight.items;

public class Ingredient {
    private String name;
    private String type;
    private boolean isExtra;
    private double price4;
    private double price8;
    private double price12;

    public Ingredient(String name, String type, boolean isExtra, double price4, double price8, double price12) {
        this.name = name;
        this.type = type;
        this.isExtra = isExtra;
        this.price4 = price4;
        this.price8 = price8;
        this.price12 = price12;
    }

    public double getPrice(int size) {
       return switch (size) {
           case 4 -> price4;
           case 8 -> price8;
           case 12 -> price12;
           default -> 0;
        };
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice12() {
        return price12;
    }

    public double getPrice8() {
        return price8;
    }

    public double getPrice4() {
        return price4;
    }

    public boolean isExtra() {
        return isExtra;
    }

    @Override
    public String toString() {
        return name + (isExtra ? " (Extra)" : "");
    }
}
