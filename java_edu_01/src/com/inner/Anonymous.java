package com.inner;

public class Anonymous {
    CC c = new B();
    public void abc() {
        c.bcd();
    }

    class B implements CC {
        public void bcd() {
            System.out.println(" 인스턴스 이너 클래스 ");
        }
    }




}
