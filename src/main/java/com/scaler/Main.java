package com.scaler;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student vishal = new Student();
        vishal.psp = 70;
        vishal.age = 24;
        vishal.name = "Vishal";
        vishal.batchName = "Apr 23 Intermediate";

        Student naman = new Student();
        naman.email = "naman@scaler.com";
        naman.name = "Naman";
        naman.batchName = "May 21 Intermediate";

        vishal.changeBatch("Feb 24 Advanced");
        naman.changeBatch("Feb 22 Intermediate");


        naman.name = "Buhahahahahahah";

    }
}