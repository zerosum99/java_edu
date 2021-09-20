package com.inner;

public class OuterLocal {
    int a = 3;
    public void abc() {
        int b = 5;

        class BL {
            void bcd() {
                System.out.println(a);
                System.out.println(b);
                a =5;
            }
        }

        BL bl = new BL();
        bl.bcd();
    }
}
