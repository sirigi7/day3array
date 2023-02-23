package com.assignment;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 9 };
        int largest = arr[0];
        int secondLargest = arr[0];

        // Finding the largest and second largest elements in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        // Printing the second largest element
        System.out.println("Second largest element in the array: " + secondLargest);
    }
}
