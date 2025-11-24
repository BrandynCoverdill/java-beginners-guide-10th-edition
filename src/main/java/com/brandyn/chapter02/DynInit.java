package com.brandyn.chapter02;

import java.text.DecimalFormat;

/**
 * Demonstrate dynamic initialization.
 */
public class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;

        // dynamically initialize volume
        double volume = Math.PI * radius * radius * height;
        DecimalFormat df = new DecimalFormat("#.#####");

        System.out.println("Volume is " + df.format(volume));
    }
}
