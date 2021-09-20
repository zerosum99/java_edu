package com.inner;

public class Annoymous1 {

    CC cc = new CC() {
        public void bcd() {
            System.out.println(" 익명 이너 클래스");
        }
    };

    public void abc() {
        cc.bcd();
    }
}
