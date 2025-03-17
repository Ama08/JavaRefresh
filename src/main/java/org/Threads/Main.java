package org.Threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("main method is starting");

        ThreadChild thread1 = new ThreadChild();
        ThreadChild thread2 = new ThreadChild();

        thread1.setName("thread1");
        thread2.setName("thread2");

        System.out.println("main method is ending");

    }
}
