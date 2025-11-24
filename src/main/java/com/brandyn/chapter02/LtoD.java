package com.brandyn.chapter02;

/**
 * Demonstrate automatic conversion from long to double.
 */
public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L = " + L);
        System.out.println("D = " + D);
    }
}
