package org.comparitor;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    public int compare(Car car1, Car car2) {
        String make1=car1.getMake();
        String make2=car2.getMake();
        if (make1.compareTo(make2)<0){
            return -1;
        }
        if (make1.compareTo(make2)>0){
            return 1;
        }
        else
            return 0;
    }


}
