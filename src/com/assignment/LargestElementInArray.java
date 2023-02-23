package com.assignment;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 4 };

        // Initializing the largest element as the first element in the array
        int largest = arr[0];

        // Iterating through the array and updating the largest element if a larger element is found
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Printing the largest element in the array
        System.out.println("The largest element in the array is " + largest);
    }
}
