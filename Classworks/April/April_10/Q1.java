// Given an unsorted array, implement insertion sort and merge sort to sort the arrays. 

package Classworks.April.April_10;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] arr1 = { 12, 11, 13, 5, 6, 7 };
        int[] arr2 = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Unsorted Array: " + Arrays.toString(arr1));
    
        // Sorting using Insertion Sort
        insertionSort(arr1);
        System.out.println("Sorted Array using Insertion Sort: " + Arrays.toString(arr1));
        
        // Sorting using Merge Sort
        mergeSort(arr2);
        System.out.println("Sorted Array using Merge Sort: " + Arrays.toString(arr2));
    }
    
    // Implementation of Insertion Sort algorithm
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
    
            // Shift all elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            // Insert key at the correct position
            arr[j + 1] = key;
        }
    }
    
    // Implementation of Iterative Merge Sort algorithm ( Dynamic Programming )
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        
        // Divide the array into sub-arrays of size 1, then merge adjacent sub-arrays
        for (int size = 1; size <= arr.length; size *= 2) {
            for (int left = 0; left < arr.length; left += 2*size) {
                int mid = Math.min(left + size - 1, arr.length - 1);
                int right = Math.min(left + 2*size - 1, arr.length - 1);
                merge(arr, left, mid, right);
            }
        }
    }
    
    // Merge two sub-arrays into a single sorted sub-array
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
    
        // Compare elements of both sub-arrays and add the smaller one to the temp array
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
    
        // Copy any remaining elements in the left sub-array to the temp array
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
    
        // Copy any remaining elements in the right sub-array to the temp array
        while (j <= right) {
            temp[k++] = arr[j++];
        }
    
        // Copy the temp array back into the original array
        System.arraycopy(temp, 0, arr, left, temp.length);
    }
}    