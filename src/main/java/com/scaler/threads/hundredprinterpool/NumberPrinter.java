package com.scaler.threads.hundredprinterpool;

public class NumberPrinter implements Runnable {
//    public static int nextNumberToPrint = 1;
    private int numberToPrint;

    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {

        System.out.println(numberToPrint + " printed by: Thread# " + Thread.currentThread().getName());

//        System.out.println(nextNumberToPrint);
//        nextNumberToPrint += 1;
    }
}
