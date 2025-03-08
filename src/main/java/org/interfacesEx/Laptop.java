package org.interfacesEx;

public class Laptop implements BasketItem {
    private double cpuSpeed;
    private double memory;
    private double hardDrive;
    private String name;
    private double price;

    public Laptop(double cpuSpeed, double memory, double hardDrive, String name, double price) {
        this.cpuSpeed = cpuSpeed;
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {

    }
}
