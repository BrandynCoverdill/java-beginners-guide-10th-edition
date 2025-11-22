package com.brandyn.chapter01;

/**
 * This program displays a conversion table of inches to meters.
 */
public class InchToMetersTable {
    public static void main(String[] args) {
        double inches, meters;
        int counter = 0;

        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37;

            // rounds meters to 3rd decimal place
            meters = Math.round(meters * 1000.00) / 1000.00;

            System.out.println(inches + " inches is equal to " + meters + " meters.");
            counter++;

            if (counter % 12 == 0) {
                System.out.println();
            }
        }
    }
}
