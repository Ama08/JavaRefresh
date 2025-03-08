package org.interfacesEx;

import java.util.ArrayList;

public class Basket {
    private ArrayList<BasketItem> basketItems = new ArrayList<>();

    public void addItem(BasketItem basketItem){
        basketItems.add(basketItem);
    }

    public void removeItem(BasketItem basketItem){
        basketItems.remove(basketItem);
    }

    public ArrayList<BasketItem> getAllItems(){
        return new ArrayList<>(basketItems);
    }

}
