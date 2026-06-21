package org.example.Object_Class_Practice;

public class _9_Student {
    int id = 101;

    public boolean equals(Object obj) {

        _8_Student s = (_8_Student) obj;

        return id == s.id;
    }

    public static void main(String[] args) {

        _8_Student s1 = new _8_Student();

        _8_Student s2 = new _8_Student();

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));
    }
}

//== vs equals()