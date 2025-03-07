package org.dependenciesEx;

public class Processor {
    final double SPEED;
    final int NUMBER_OF_CORES;

    public Processor(double SPEED, int NUMBER_OF_CORES) {
        this.SPEED = SPEED;
        this.NUMBER_OF_CORES = NUMBER_OF_CORES;
    }

    public void processData(String data){
        System.out.println("processData " + data);
    }

    public double getSPEED() {
        return SPEED;
    }

    public int getNUMBER_OF_CORES() {
        return NUMBER_OF_CORES;
    }
}
