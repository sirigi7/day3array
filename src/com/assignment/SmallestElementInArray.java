package com.assignment;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 4 };

        // Initializing the smallest element as the first element in the array
        int smallest = arr[0];

        // Iterating through the array and updating the smallest element if a smaller element is found
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Printing the smallest element in the array
        System.out.println("The smallest element in the array is " + smallest);
    }
}
