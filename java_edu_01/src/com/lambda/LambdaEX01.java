package com.lambda;

interface A {
    void abc();
}

class B implements A {
    @Override
    public void abc() {
        System.out.println(" 인터페이스를 클래스 내부에 정의 ");
    }
}

public class LambdaEX01 {
    public static void main(String[] args) {
        A a1 = new B();
        a1.abc();

        A a2 = new A() {
            @Override
            public void abc() {
                System.out.println("익명 클래스로 인터페이스 정의");
            }
        };
        a2.abc();

        A a3 = () -> { System.out.println(" 람다식으로 인터페이스 구현");};
        a3.abc();

    }
}
