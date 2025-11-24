package com.brandyn.chapter02;

/**
 * Compute the distance to a lightning
 * strike whose sound takes 7.2 seconds
 * to reach you.
 */
public class Sound {
    public static void main(String[] args) {
        double dist;

        dist = 7.2 * 1100;

        System.out.println("The lightning is " + dist + " feet away.");

        // exercise 6 of Try This 2-1
        double timeInterval = 3.5;
        int soundSpeed = 1100;

        dist = (timeInterval / 2) * soundSpeed;
        System.out.println("The distance between the rock wall and you is " +
                dist + " feet.");
    }
}
