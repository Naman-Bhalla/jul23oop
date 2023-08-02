package com.scaler.threads.multithreadedhelloworld;

public class Main {

    public static void main(String[] args) {
        System.out.println("1 " + Thread.currentThread().getName());
        System.out.println("2");

        // 1. Create instance of the task
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        helloWorldPrinter.run();
        // 2. Put that instance in an object of Thread
        Thread t = new Thread(helloWorldPrinter);

        // 3. Start the thread (it just tells the cpu that I want to run this thread)
        t.start();

        System.out.println("3");
        System.out.println("4 " + Thread.currentThread().getName());
    }
}
