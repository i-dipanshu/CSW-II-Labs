package Classworks.April.April_17;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 9, 5, 8, 3, 1, 6, 7 };

        System.out.println("Unsorted Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array using Quick Sort: " + Arrays.toString(arr));
    }

    // Implementation of Quick Sort algorithm
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // Selecting the middle element as the pivot
        int pivotIndex = low + (high - low) / 2;
        int pivotValue = arr[pivotIndex];

        // Move the pivot element to the end
        swap(arr, pivotIndex, high);

        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivotValue) {
                swap(arr, i, j);
                i++;
            }
        }

        // Move the pivot element back to its final position
        swap(arr, i, high);

        return i;
    }

    // helper function to swap 
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
