package org.comparitor;

public class Car {

    private int engineSize;
    private String make;
    public Car(int engineSize, String make) {
        this.engineSize = engineSize;
        this.make = make;
    }
    public int getEngineSize() {
        return engineSize;
    }
    public String getMake() {
        return make;
    }

}
