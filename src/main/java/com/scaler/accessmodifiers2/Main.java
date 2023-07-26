package com.scaler.accessmodifiers2;

import com.scaler.accessmodifiers1.Student;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
//        s.name = "Namna"; // private
//        s.age = 14; // default
//        s.gender = "Male"; // protected
        s.email = "Namna@scaler.com"; // public
    }
}
