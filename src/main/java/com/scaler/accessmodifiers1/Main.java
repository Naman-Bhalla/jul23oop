package com.scaler.accessmodifiers1;

import com.scaler.accessmodifiers1.Student;

public class Main {

//    static int x = 2;

    public static void main(String[] args) {
//        x += 1;
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
