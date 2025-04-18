package org.optionals;

import java.util.Optional;

public class Computer {
    private String model;
    private Motherboard motherboard;

    public Computer(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Optional<Motherboard> getMotherboard() {
        return Optional.ofNullable(motherboard);
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
