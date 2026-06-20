package org.example.Object_Class_Practice;

public class _8_Student {
    int id;
    _8_Student(){
        id=101;
    }

    public boolean equals (Object obj){

        _8_Student s = (_8_Student) obj;

        return this.id == s.id;
    }

}
