package com.generic;

class GenericM {
    public <T> T method1(T t) {
        return t;
    }

    public <T> boolean method2(T t1, T t2) {
        return  t1.equals(t2);
    }

    public <K,V> void method3(K k, V v) {
        System.out.println(k + " : " + v);
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        GenericM gm = new GenericM();
        String st1 = gm.<String>method1("안녕");
        String st2 = gm.method1("가세요");
        System.out.println(st1);
        System.out.println(st2);

        boolean bl1 = gm.<Double>method2(2.5, 2.5);
        boolean bl2 = gm.method2(2.5,2.5);
        System.out.println(bl1);
        System.out.println(bl2);

        gm.<String, Integer>method3("국어", 100);
        gm.method3("국어", 100);
    }


}
