package org.classAndObject;

public class Memory {
    final String MODEL;
    final double CAPACITY;
    private double usedSpace;
    final double SPEED;

    public Memory(String MODEL, double CAPACITY, double SPEED) {
        this.MODEL = MODEL;
        this.CAPACITY = CAPACITY;
        this.SPEED = SPEED;
    }

    public String getMODEL() {
        return MODEL;
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

    public static void storeData(String data){
        System.out.println("storeData " + data);
    }
}
