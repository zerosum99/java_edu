package com.variable;

public class Oporator {

    public static void main(String[] args) {
        System.out.println(2 + 3);
        System.out.println(8 -5);
        System.out.println(7 * 2);
        System.out.println(7 /2);
        System.out.println(8 % 5);
        System.out.println();

        int value1 = 3;
        value1 ++ ;
        System.out.println(value1);

        int value2 = 3;
        ++ value2;
        System.out.println(value2);
        System.out.println();

        int data = 13;
        System.out.println(Integer.toBinaryString(data));
        System.out.println(Integer.parseInt("1101",2));
        System.out.println(Integer.toOctalString(data));
        System.out.println(Integer.parseInt("15",8));
        System.out.println(Integer.toHexString(data));
        System.out.println(Integer.parseInt("D",16));

    }
}
