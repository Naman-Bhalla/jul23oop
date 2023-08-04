package com.scaler.threads.hundredprinter;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; ++i) {

            NumberPrinter numberPrinter = new NumberPrinter();

            Thread t = new Thread(numberPrinter);

            t.start();
        }
    }
}
