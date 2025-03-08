package org.dependenciesEx;

public class Memory {
    final double CAPACITY;
    private double usedSpace;
    final double SPEED;

    public Memory(double CAPACITY, double SPEED) {
        this.CAPACITY = CAPACITY;
        this.SPEED = SPEED;
    }

    public double getCAPACITY() {
        return CAPACITY;
    }

    public double getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(double usedSpace) {
        this.usedSpace = usedSpace;
    }

    public double getSPEED() {
        return SPEED;
    }

    public void storeData(String data){
        System.out.println("storeData " + data);
    }

    @Override
    public String toString() {
        return "Memory{Capacity='" + CAPACITY + " Speed= " + SPEED +"}";
    }

}
