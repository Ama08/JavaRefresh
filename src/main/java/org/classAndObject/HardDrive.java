package org.classAndObject;

public class HardDrive {
    final String MODEL;
    final double CAPACITY;
    private double usedSpace;

    public HardDrive(String MODEL, double CAPACITY) {
        this.MODEL = MODEL;
        this.CAPACITY = CAPACITY;
    }

    public static String readData(String file) {
        return "data from " + file;
    }

    public static void writeData(String data, String file){
        System.out.println("writeData"+ data + " " + file);
    }

    public String getMODEL() {
        return MODEL;
    }

    public double getUsedSpace() {
        return usedSpace;
    }

    public void setUsedSpace(double usedSpace) {
        this.usedSpace = usedSpace;
    }

    public double getCAPACITY() {
        return CAPACITY;
    }
}
