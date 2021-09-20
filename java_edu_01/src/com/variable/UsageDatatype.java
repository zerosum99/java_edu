package com.variable;

public class UsageDatatype {

    public static void main(String[] args) {
        int a = 3;
        int b;
        b = 4;
        System.out.println(a);
        System.out.println(b);

        int value1 = 3;
        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
        }

        System.out.println(value1);

        float f1 = 1.0000001f;
        System.out.println(f1);

        float f2 = 1.00000001f;
        System.out.println(f2);

        double d1 = 1.000000000000001;
        System.out.println(d1);

        double d2 = 1.0000000000000001;
        System.out.println(d2);

        int v1 = (int)5.3;
        long v2 = (long)10;
        float v3 = (float)5.8;
        double v4 = (double)16;

        System.out.println(v1+" " + v2+ " "+ v3 + " " + v4);


    }
}
