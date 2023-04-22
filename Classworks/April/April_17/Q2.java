// Given an array, search for a value at a particular index using the quick select method.

package Classworks.April.April_17;


import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 9, 5, 8, 3, 1, 6, 7 };
        int index = 4; // index of the element to be searched

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        int result = quickSelect(arr, 0, arr.length - 1, index);

        System.out.println("Element at index " + index + " is " + result);
    }

    // Implementation of Quick Select algorithm
    public static int quickSelect(int[] arr, int low, int high, int index) {
        if (low == high) {
            return arr[low];
        }

        // partition method defined in Q1.java
        int pivot = Q1.partition(arr, low, high);

        // If the pivot is at the index we're searching for, return it
        if (pivot == index) {
            return arr[pivot];
        }
        // If the pivot is greater than the index, search in the left partition
        else if (pivot > index) {
            return quickSelect(arr, low, pivot - 1, index);
        }
        // If the pivot is less than the index, search in the right partition
        else {
            return quickSelect(arr, pivot + 1, high, index);
        }
    }
}
