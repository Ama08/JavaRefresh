package org.generics;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {
        Farmer<Produce> numberFarmer = new Farmer<Produce>();
        numberFarmer.addProduce(new Apple("Granny Smith"));
        numberFarmer.addProduce(new Banana("Plantain"));
        numberFarmer.addProduce(new Orange("Mandarin"));
        System.out.println("The farmer is farming " + numberFarmer.getProduce(0));

        numberFarmer.printAllSpecies();
        
    }
}
