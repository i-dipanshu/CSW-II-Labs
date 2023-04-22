// Given an array containing 0s, 1s, and 2s.
// Write a Java program to sort the array so that 0s come 
// first followed by 1s followed by 2s in linear time.

// Note - This approach can be used for Q2. as well.

package Classworks.April.April_10;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 1, 2, 1, 0 }; // Test array containing 0s, 1s, and 2s
        System.out.println("Original Array: " + Arrays.toString(arr));
        sortZeroOneTwo(arr); // Call the sorting function
        System.out.println("Sorted Array: " + Arrays.toString(arr)); // Print the sorted array
    }

    // Dutch National Flag Algorithm
    public static void sortZeroOneTwo(int[] arr) {
        int low = 0; // Initialize the low index to the start of the array
        int mid = 0; // Initialize the mid index to the start of the array
        int high = arr.length - 1; // Initialize the high index to the end of the array

        // Continue until all elements are sorted
        while (mid <= high) { 
            switch (arr[mid]) {
                case 0: // If the element at mid index is 0
                    swap(arr, low, mid); // Swap with the element at low index
                    low++; // Increment low index
                    mid++; // Increment mid index
                    break;
                case 1: // If the element at mid index is 1
                    mid++; // No swapping needed, increment mid index
                    break;
                case 2: // If the element at mid index is 2
                    swap(arr, mid, high); // Swap with the element at high index
                    high--; // Decrement high index
                    break;
            }
        }
    }

    // Helper function to swap two elements in the array
    public static void swap(int[] arr, int i, int j) { 
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
