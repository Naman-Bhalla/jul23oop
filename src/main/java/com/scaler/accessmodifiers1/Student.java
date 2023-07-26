package com.scaler.accessmodifiers1;

public class Student {
    private String name; // = "Alok";
    int age = 10;
    protected String gender;
    public String email;

    void do1() {
        name = "Namna";
    }

    public void changeName(String newName) {
        System.out.println("Someone is trying to change the name of student");
        name = newName;
    }

    public Student() { // constructor 1
        System.out.println("A CUSTOM CONSTRUCTOR THAT I CREATED");
        name = "Naman Bhalla";
        age = 24;
    }

    public Student(String name, int age, String gender) { // costructor 2
        System.out.println("CONSTRUCTOR IS STARTINGGGGG");
        this.name = name;
    }
}
