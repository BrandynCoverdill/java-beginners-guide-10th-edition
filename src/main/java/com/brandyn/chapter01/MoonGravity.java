package com.brandyn.chapter01;

/**
 * This program calculates the weight on earth to the weight on the moon.
 */
public class MoonGravity {
    public static void main(String[] args) {
        double earthWeight, moonWeight;

        earthWeight = 200;
        moonWeight = earthWeight * 0.17;

        System.out.println("The weight on Earth is: " + earthWeight + " pounds.");
        System.out.println("The weight on the moon is: " + moonWeight + " pounds.");
    }
}
