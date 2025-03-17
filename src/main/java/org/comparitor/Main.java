package org.comparitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarComparator carComparator = new CarComparator();

        System.out.println("sort cars by make");
        List<Car> carsList = new ArrayList<Car>();
        carsList.add(new Car(1000,"Renault"));
        carsList.add(new Car(600, "Ford"));
        carsList.add(new Car(500, "Vauxhall"));
        carsList.add(new Car(200, "Citroen"));

        Collections.sort(carsList, carComparator);
        for (Car eachCar : carsList) {
            System.out.print("this car make is:");
            System.out.println(eachCar.getMake());
        }

        }
}
