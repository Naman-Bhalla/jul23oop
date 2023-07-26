package com.scaler.constructorchaining;

public class C extends B {
        int c;
    C() {
        System.out.println("C");
    }

    C(String word) {
        System.out.println("C - " + word);
    }
}
