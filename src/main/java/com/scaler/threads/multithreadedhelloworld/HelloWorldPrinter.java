package com.scaler.threads.multithreadedhelloworld;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World 1 " + Thread.currentThread().getName());
        System.out.println("Hello World 2" + Thread.currentThread().getName());
        blabla();
    }


    private void blabla() {
        System.out.println("Bla Bla");
    }
}
