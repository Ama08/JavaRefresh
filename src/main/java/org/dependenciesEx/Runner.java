package org.dependenciesEx;

public class Runner {
    public static void main(String[] args) {
        Processor processor1 = new Processor(3.6, 8);
        HardDrive hardDrive1 = new HardDrive(36);
        Memory memory1 = new Memory(5.6,96 );
        Processor processor2 = new Processor(93, 16);
        HardDrive hardDrive2 = new HardDrive(42);
        Memory memory2 = new Memory(3.6,5 );
        Computer computer1 = new Computer("Dell", processor1, hardDrive1, memory1);
        Computer computer2 = new Computer("Lenovo", processor2, hardDrive2, memory2);
        PowerSource powerSource = new PowerSource();
        powerSource.setWatts(50);
        computer1.getPower(powerSource);

        ComputerStore computerStore = new ComputerStore("Computer Story");
        computerStore.addComputer(computer1);
        computerStore.addComputer(computer2);
        System.out.println(computerStore.getAllComputers());

        System.out.println(computer1.getHardDrive().getCAPACITY() + "\n" + computer2.getMODEL());
    }
}
