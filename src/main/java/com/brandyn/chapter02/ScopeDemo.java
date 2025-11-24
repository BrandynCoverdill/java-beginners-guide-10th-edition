package com.brandyn.chapter02;

/**
 * Demonstrate block scope.
 */
public class ScopeDemo {
    public static void main(String[] args) {
        int x; // known to all code within main

        x = 10;
        if (x == 10) { // start new scope
            int y = 20; // known only to block

            // x and y are both known here

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

        // y = 100 // Error! y is not known here - outside its scope

        // x is still known here
        System.out.println("x = " + x);
    }
}
