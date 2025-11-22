package com.brandyn.chapter01;

/**
 * This program displays a conversion table of gallons to liters.
 */
public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;

        counter = 0;

        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++;

            if (counter % 10 == 0) {
                System.out.println();
            }
        }
    }
}
