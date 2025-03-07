package org.interfacesEx;

import java.util.ArrayList;

public class CalorieCounter {
    private ArrayList<FoodItem> lowCalorieFood = new ArrayList<>();

    public void addLowCalorieFood(FoodItem foodItem){
        if (foodItem.getCalories() <= 500){
            lowCalorieFood.add(foodItem);
        }

    }
    public ArrayList<FoodItem> getAllLowCaloriFoods(){
        return new ArrayList<>(lowCalorieFood);
    }


}
