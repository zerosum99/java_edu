package com.inner;

public class OuterA {
    public int a = 3;
    protected  int b = 4;
    int c = 5;
    private int d =6;

    void abc() {
        System.out.println(" A class method abc() ");
    }

    public class B {
        public void bcd() {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            abc();

        }
    }
}
