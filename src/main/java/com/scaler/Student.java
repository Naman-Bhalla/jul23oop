package com.scaler;

public class Student {
    String name;
    int age;
    String email;
    String password;
    double psp;
    String batchName;

    void changeBatch(String newBatchName) {
        batchName = newBatchName;
    }

    void updatePsp(double offset) {
        psp += offset;
    }

    void printNameWithMeow() {
        System.out.println(name + " Meow");
    }

}
