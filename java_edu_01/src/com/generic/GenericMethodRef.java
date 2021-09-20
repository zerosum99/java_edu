package com.generic;

interface AA {
    void abc();

}

class BB {
    void bcd() {
        System.out.println(" 메소드");
    }
}

public class GenericMethodRef {

    public static void main(String[] args) {
        AA a1 = new AA() {
            @Override
            public void abc() {
                BB b = new BB();
                b.bcd();
            }
        };

        AA a2 = () -> {
            BB b = new BB();
            b.bcd();
        };

        BB b = new BB();
        AA a3 = b::bcd;

        a1.abc();
        a2.abc();
        a3.abc();
    }


}
