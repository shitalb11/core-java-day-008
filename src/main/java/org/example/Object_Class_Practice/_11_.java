package org.example.Object_Class_Practice;

public class _11_ {
    int id = 101;

    public boolean equals(Object obj) {

        _11_ s = (_11_) obj;

        return id == s.id;
    }
    public int hashcode(){
        return id;
    }

    public static void main(String[] args) {
        _11_ s1 = new _11_();
        _11_ s2 = new _11_();

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashcode());
        System.out.println(s2.hashcode());
    }
}
//equals() + hashCode()