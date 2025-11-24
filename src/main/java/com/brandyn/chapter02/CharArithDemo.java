package com.brandyn.chapter02;

/**
 * Character variables can be handled like integers.
 *
 * This is allowed because char is an unsigned 16-bit type.
 */
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch = " + ch); // X

        ch++;
        System.out.println("ch = " + ch); // Y

        ch = 90;
        System.out.println("ch = " + ch); // Z
    }
}
