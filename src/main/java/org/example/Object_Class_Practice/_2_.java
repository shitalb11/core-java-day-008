package org.example.Object_Class_Practice;

public class _2_ {
    public static void main(String[] args) {

        class Student {
            int id = 101;
            String name = "Shital";

            @Override
            public String toString() {
                return "ID = " + id + ", Name = " + name;
            }
        }

        Student s = new Student();

        System.out.println(s);
    }
}