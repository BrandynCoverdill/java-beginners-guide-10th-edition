package com.brandyn.chapter02;

/**
 * Using a cast.
 */
public class UseCast {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 with fractions: " +
                    (double) i / 3);
            System.out.println();
        }
    }
}
