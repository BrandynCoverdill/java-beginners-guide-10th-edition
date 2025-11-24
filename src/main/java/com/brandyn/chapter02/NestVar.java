package com.brandyn.chapter02;

/**
 * This program attempts to declare a variable in an inner scope with
 * the same name as one defined in an outer scope.
 *
 * *** This program will not compile if line 15 is uncommented. ***
 *
 * *** If line 15 is left uncommented, it will run indefinitely. ***
 */
public class NestVar {
    public static void main(String[] args) {
        int count;
        for (count = 0; count < 10; count++) {
            System.out.println("This is count: " + count);

            // int count; // uncomment this line
            for (count = 0; count < 2; count++) {
                System.out.println("This program is an error!");
            }
        }
    }
}
