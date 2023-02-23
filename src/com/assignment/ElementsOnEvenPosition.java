package com.assignment;

public class ElementsOnEvenPosition {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Iterating through the array and printing the elements present on even positions
        for (int i = 1; i < arr.length; i += 2) {
            System.out.println("Element at position " + i + " is " + arr[i]);
        }
    }
}
