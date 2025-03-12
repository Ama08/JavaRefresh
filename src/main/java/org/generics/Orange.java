package org.generics;

public class Orange implements Produce{
    private String species;

    public Orange(String species) {
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
