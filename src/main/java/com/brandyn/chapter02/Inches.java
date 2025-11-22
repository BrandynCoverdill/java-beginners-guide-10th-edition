package com.brandyn.chapter02;

import java.text.DecimalFormat;

/**
 * Compute the number of cubic inches
 * in 1 cubic mile.
 */
public class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        im = 5280 * 12;
        ci = im * im * im;

        // Format the long integer to contain commas to be more readable
        DecimalFormat df = new DecimalFormat("###,###,###");

        System.out.println("There are " + df.format(ci) + " cubic inches in a cubic mile.");
    }
}
