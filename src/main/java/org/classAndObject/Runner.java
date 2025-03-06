package org.classAndObject;

public class Runner {
    public static void main(String[] args) {
        HardDrive drive1 = new HardDrive("HP", 32);
        Memory memory = new Memory("HP", 32, 64.5);
        Processor processor = new Processor("HP", 64.5, 8);

        drive1.setUsedSpace(50);

        System.out.println(drive1.getCAPACITY());
        System.out.println(memory.MODEL);
        System.out.println(processor.SPEED);
        System.out.println(drive1.getUsedSpace());
    }
}
