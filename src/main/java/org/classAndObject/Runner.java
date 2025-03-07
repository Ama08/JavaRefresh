package org.classAndObject;

public class Runner {
    public static void main(String[] args) {
        HardDrive hardDrive = new HardDrive("HP", 32);
        Memory memory = new Memory("HP", 32, 64.5);
        Processor processor = new Processor("HP", 64.5, 8);

        hardDrive.setUsedSpace(50);

        System.out.println(hardDrive.getCAPACITY());
        System.out.println(memory.MODEL);
        System.out.println(processor.SPEED);
        System.out.println(hardDrive.getUsedSpace());
    }
}
