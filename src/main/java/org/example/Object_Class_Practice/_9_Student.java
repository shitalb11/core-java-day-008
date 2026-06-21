package org.example.Object_Class_Practice;

public class _9_Student {
    int id = 101;

    public boolean equals(Object obj) {

        _8_Student s = (_8_Student) obj;

        return id == s.id;
    }

}
