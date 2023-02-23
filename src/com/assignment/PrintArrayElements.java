package com.assignment;

public class PrintArrayElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        // Using a for loop to iterate through the array and print each element
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Using a for-each loop to iterate through the array and print each element
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
