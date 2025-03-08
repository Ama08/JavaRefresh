package org.dependenciesEx;

import java.util.ArrayList;

public class ComputerStore {
    private String name;
    private ArrayList<Computer> computers = new ArrayList<>();

    public ComputerStore(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addComputer(Computer computer){
        computers.add(computer);

    }

    public ArrayList<Computer> getAllComputers() {
        for(Computer computer : computers){
            System.out.println(computer + "\n");
        }
        return computers;
    }
}
