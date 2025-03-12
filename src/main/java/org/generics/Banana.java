package org.generics;

public class Banana implements Produce{
    private String species;

    public Banana(String species) {
        this.species = species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String getSpecies() {
        return species;
    }

}
