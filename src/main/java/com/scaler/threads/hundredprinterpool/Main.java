package com.scaler.threads.hundredprinterpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        ExecutorService executorService2 = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 10000; ++i) {

            if (i == 50) {
                System.out.println("Wait");
            }

            NumberPrinter numberPrinter = new NumberPrinter(i);

            if (i % 2 == 0) {
                executorService2.execute(numberPrinter);
            } else {
                executorService1.execute(numberPrinter);
            }

//            Thread t = new Thread(numberPrinter);
//
//            t.start();
        }
    }
}
