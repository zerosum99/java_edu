package com.inner;

public class OuterStack {

    int a =3;
    static int b = 4;
    void method1() {
        System.out.println(" instance method");
    }

    static void method2() {
        System.out.println("static method");
    }

    public static class BB {
        public void bcd() {
            System.out.println(b);
            method2();
        }
    }
}
