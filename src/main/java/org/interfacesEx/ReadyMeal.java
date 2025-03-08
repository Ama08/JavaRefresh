package org.interfacesEx;

public class ReadyMeal implements BasketItem, FoodItem {
    private String cuisineType;
    private int calories;
    private String name;
    private double price;

    public ReadyMeal(String cuisineType, int calories, String name, double price) {
        this.cuisineType = cuisineType;
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
