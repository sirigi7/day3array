package com.assignment;

public class ascendingsort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 6 };

        // Bubble sort algorithm to sort the array in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.print("Sorted array in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
