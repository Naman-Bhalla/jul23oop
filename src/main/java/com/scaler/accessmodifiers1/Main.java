package com.scaler.accessmodifiers1;

import com.scaler.accessmodifiers1.Student;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Naman";
        student.age = 12;
        student.gender = "Male";
        student.email = "naman@scaler.com";

        student.changeName("Rohit");

        Student s = new Student(
                "Naman",
                24,
                "Male"
        );
    }
}
