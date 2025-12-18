package com.brandyn.chapter03;

/**
 * Try This 3-1
 *
 * A simple help system.
 */
public class Help {
    public static void main(String[] args) throws java.io.IOException {

        // Defined variables
        char userSelection;

        // Print options
        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("Choose one: ");

        // Get user selection
        userSelection = (char) System.in.read();

        switch (userSelection) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The traditional switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found.");
        }

    }
}
