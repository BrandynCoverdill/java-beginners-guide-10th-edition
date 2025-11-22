package com.brandyn.chapter01;

public class Example3 {
    public static void main(String[] args) {
        int v;
        double x;

        v = 10;
        x = 10.0;

        System.out.println("Original value of v: " + v);
        System.out.println("Original value of x: " + x);
        System.out.println();

        v /= 4;
        x /= 4;

        System.out.println("v after division: " + v);
        System.out.println("x after division: " + x);

        /*
            When dividing my ints, the decimal part is stripped away and the left will stay intact. For example:
            10 / 3 -> 3
            -8 / 3 -> -2
         */
    }
}
