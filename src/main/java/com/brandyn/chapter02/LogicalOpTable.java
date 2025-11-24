package com.brandyn.chapter02;

/**
 * A truth table for the logical operators.
 */
public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT P");

        p = q = true;
        System.out.print((p?1:0) + "\t\t" + (q?1:0) + "\t\t");
        System.out.print(((p&&q)?1:0) + "\t\t" + ((p||q)?1:0) + "\t\t");
        System.out.println(((p^q)?1:0) + "\t\t" + ((!p)?1:0));

        p = true;
        q = false;
        System.out.print((p?1:0) + "\t\t" + (q?1:0) + "\t\t");
        System.out.print(((p&&q)?1:0) + "\t\t" + ((p||q)?1:0) + "\t\t");
        System.out.println(((p^q)?1:0) + "\t\t" + ((!p)?1:0));

        p = false;
        q = true;
        System.out.print((p?1:0) + "\t\t" + (q?1:0) + "\t\t");
        System.out.print(((p&&q)?1:0) + "\t\t" + ((p||q)?1:0) + "\t\t");
        System.out.println(((p^q)?1:0) + "\t\t" + ((!p)?1:0));

        p = q = false;
        System.out.print((p?1:0) + "\t\t" + (q?1:0) + "\t\t");
        System.out.print(((p&&q)?1:0) + "\t\t" + ((p||q)?1:0) + "\t\t");
        System.out.println(((p^q)?1:0) + "\t\t" + ((!p)?1:0));
    }
}
