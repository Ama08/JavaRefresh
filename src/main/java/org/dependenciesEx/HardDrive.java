package org.dependenciesEx;

public class HardDrive {
    final double CAPACITY;
    private double usedSpace;

    public HardDrive( double CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public String readData(String file) {
        return "data from " + file;
    }

    public void writeData(String data, String file){
        System.out.println("writeData"+ data + " " + file);
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

    @Override
    public String toString() {
        return "HardDrive{Capacity='" + CAPACITY + "', UsedSpeed=" + usedSpace + "}";
    }
}
