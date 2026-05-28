package org.example.Object_Class;

public class Aa {
    public static void main(String[] args) {
        class A{}

        class B extends A{}

        A a = new A();
        a.hashCode();

        B b = new B();
        b.hashCode();
    }
}
