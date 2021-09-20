package com.ex03;

interface A {
    public abstract void abc();
}

class B implements A {
    public void abc() {
        System.out.println(" 입력매개변수로 전달 ");
    }
}

class C {
    void cde(A a) {
        a.abc();
    }
}

public class AnonymousClass_3 {

    public static void main(String[] args) {
        C c = new C();
        A a = new B();
        c.cde(a);
        c.cde(new B());
    }


}
