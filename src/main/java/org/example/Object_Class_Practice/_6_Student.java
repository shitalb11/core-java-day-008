package org.example.Object_Class_Practice;

public class _6_Student {

    int id = 101;
    String name = "Shital";

    public String toString(){
        return id + " " + name;
    }

    public static void main(String[] args) {
        _6_Student s = new _6_Student();
        System.out.println(s);
    }
}
