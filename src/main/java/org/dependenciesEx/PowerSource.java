package org.dependenciesEx;

public class PowerSource {
    private double watts;

    public void setWatts(double watts) {
        this.watts = watts;
    }

    public double supplyPower(){
        return watts;
    }
}
