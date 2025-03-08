package org.classAndObject;

public class Processor {
    final String MODEL;
    final double SPEED;
    final int NUMBER_OF_CORES;

    public Processor(String MODEL, double SPEED, int NUMBER_OF_CORES) {
        this.MODEL = MODEL;
        this.SPEED = SPEED;
        this.NUMBER_OF_CORES = NUMBER_OF_CORES;
    }

    public static void processData(String data){
        System.out.println("processData " + data);
    }

    public String getMODEL() {
        return MODEL;
    }

    public double getSPEED() {
        return SPEED;
    }

    public int getNUMBER_OF_CORES() {
        return NUMBER_OF_CORES;
    }
}
