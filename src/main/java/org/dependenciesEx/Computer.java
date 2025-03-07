package org.dependenciesEx;

public class Computer {
    final String MODEL;
    HardDrive hardDrive;
    Memory memory;
    Processor processor;

    public Computer(String MODEL, Processor processor, HardDrive hardDrive, Memory memory) {
        this.MODEL = MODEL;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.memory = memory;
    }

    public void turnOn(){
        System.out.println("Computer turning on");
    }

    public void turnOff(){
        System.out.println("Computer turning off");
    }

    public String getMODEL() {
        return MODEL;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void getPower(PowerSource powerSource){
        double watts = powerSource.supplyPower();
        System.out.println(watts + " watts received from power source");
    }

    @Override
    public String toString() {
        return "Computer{MODEL='" + MODEL + "', HardDrive=" + hardDrive + ", Memory=" + memory + ", Processor=" + processor + "}";
    }
}
