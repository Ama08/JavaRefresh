package org.interfacesEx;

public class Snack implements FoodItem, BasketItem {

    private int fatContent;
    private int sugarContent;
    private int calories;
    private String name;
    private double price;

    public Snack(int fatContent, int sugarContent, int calories, String name, double price) {
        this.fatContent = fatContent;
        this.sugarContent = sugarContent;
        this.calories = calories;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public void setCalories(int calories) {

    }
}
