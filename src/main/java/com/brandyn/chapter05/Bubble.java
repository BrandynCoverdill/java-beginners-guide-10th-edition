package com.brandyn.chapter05;

/**
 * Demonstrate the Bubble Sort
 */
public class Bubble {

    /**
     * Display the array
     * @param arr The array to be displayed
     */
    private static void displayArray(int[] arr) {
        // Keep track of index - starting at first index of array
        int index = 1;

        // Print out array contents
        for (int el : arr) {
            if (index == arr.length) {
                System.out.print(el);
            } else {
                System.out.print(el + ", ");
            }
            index++;
        }

        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int size = nums.length;
        int temp;

        // Displaying original array
        System.out.println("Original Array:");
        displayArray(nums);

        // Bubble sort algorithm
        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (nums[j-1] > nums[j]) {
                    // if out of order, swap indexes
                    temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("Sorted array:");
        displayArray(nums);
    }
}
