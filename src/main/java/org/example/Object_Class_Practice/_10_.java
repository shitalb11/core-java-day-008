package org.example.Object_Class_Practice;

public class _10_ {
    int id = 101;
    public int hashCode(){
        return id;
    }

    public static void main(String[] args) {
        _10_ s = new _10_();

        System.out.println(s.hashCode());
    }
}

//hashCode()