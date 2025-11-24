package com.brandyn.chapter02;

/**
 * Finds all the prime numbers between 2 and 100.
 */
public class FindPrimeNumbers {
    public static void main(String[] args) {

        // Go through the numbers 2-100
        for (int i = 2; i <= 100; i++) {

            // Assume it is a prime number
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                // if a factor is found, it is not a prime number
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
