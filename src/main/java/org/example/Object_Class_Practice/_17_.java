package org.example.Object_Class_Practice;

public class _17_ implements Cloneable {
    int id = 101;
    public Object clone()
        throws
            CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        _17_ s1 = new _17_();

        _17_ s2 = (_17_) s1.clone();

        System.out.println(s1.id);
        System.out.println(s2.id);
    }
}
