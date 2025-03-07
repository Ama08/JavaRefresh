package org.interfacesEx;

import javax.sound.midi.Soundbank;

public class Runner {
    public static void main(String[] args) {
        Toy toy = new Toy(2 , 10, "Soldir", 25.99 );
        Laptop laptop = new Laptop(22, 56, 58, "Lenovo", 1996.50);
        Snack snack = new Snack(156, 56, 521, "KitKat", 4.99);
        Snack snack1 = new Snack(626, 46, 364, "Banana Chips", 5.99);
        ReadyMeal readyMeal = new ReadyMeal("Indian", 502, "Chicken tikka", 10.65);
        ReadyMeal readyMeal1 = new ReadyMeal("Chinese", 425, "Chow mein", 11.69);
        Basket basket = new Basket();
        CalorieCounter calorieCounter = new CalorieCounter();

        basket.addItem(toy);
        basket.addItem(laptop);
        basket.addItem(snack);
        basket.addItem(snack1);
        basket.addItem(readyMeal);
        basket.addItem(readyMeal1);

        basket.removeItem(laptop);

        calorieCounter.addLowCalorieFood(snack1);
        calorieCounter.addLowCalorieFood(snack);
        calorieCounter.addLowCalorieFood(readyMeal);
        calorieCounter.addLowCalorieFood(readyMeal1);

        for (BasketItem item : basket.getAllItems()){
            System.out.println("The Items: " + item.getName());
        }

        for (FoodItem item : calorieCounter.getAllLowCaloriFoods()){
            System.out.println("The low calorie foods are: " + item.getCalories());
        }


    }}
