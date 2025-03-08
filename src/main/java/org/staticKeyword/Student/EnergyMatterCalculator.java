package org.staticKeyword.Student;

public class EnergyMatterCalculator {
    public static double SPEED_OF_LIGHT = 299792458;

    public static double matterToEnergy(double matter){
        return matter * (SPEED_OF_LIGHT* SPEED_OF_LIGHT);
    }

    public static double energyToMatter(double energy){
        return energy / (SPEED_OF_LIGHT* SPEED_OF_LIGHT);
    }
}
