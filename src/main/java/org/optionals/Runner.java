package org.optionals;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer("HP");
        ComputerStore computerStore =  new ComputerStore();
        Motherboard motherboard1 = new Motherboard("Model");
        Consumer<Motherboard> printMotherboardModel =
                motherboard -> System.out.println(motherboard.getModel());

        computer.getMotherboard()
                .ifPresent(motherboard -> motherboard.getMemory()
                        .ifPresent(memoryChip -> memoryChip.accessData()));


        int numberOfComputers = computerStore.getComputers()
                .orElse(new ArrayList<Computer>())
                .size();

        computer.setMotherboard(motherboard1);

        Supplier<MissingMotherboardException> missingMotherboard =
                () ->  new MissingMotherboardException("missing motherboard");

        Supplier<MissingMemoryException> missingMemory =
                () ->  new MissingMemoryException("missing memory");

        try {
            computer.getMotherboard()
                    .orElseThrow(missingMotherboard)
                    .getMemory()
                    .orElseThrow(missingMemory)
                    .accessData();
        } catch (MissingMotherboardException e) {
            // code to deal with missing motherboard
            System.out.println("missing motherboard");
        } catch (MissingMemoryException e) {
            // code to deal with missing memory
            System.out.println("missing memory");
        }


    }
}
