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

    public static void main(String[] args) {

        _8_Student s1=new _8_Student();
        _8_Student s2=new _8_Student();

        System.out.println(s1.equals(s2));
    }
}

//equals() Override