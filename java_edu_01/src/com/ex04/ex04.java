package com.ex04;


interface  A {
    public abstract void abc();
}

class C {
    void cde(A a) {
        a.abc();
    }
}

public class ex04 {
    public static void main(String[] args) {
        C c = new C();
        A a = new A() {
            @Override
            public void abc() {
                System.out.println(" 익명 객체를 가지고 인자로 전달 ");
            }
        };
        c.cde(a);

        c.cde(new A() {
            @Override
            public void abc() {
                System.out.println(" 직접 입력매개변수에 전달 ");
            }
        });
    }
}

