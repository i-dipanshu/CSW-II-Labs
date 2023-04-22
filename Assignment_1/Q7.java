// Given an array, write a program to arrange its elements in waveform
// such that odd elements are lesser than its neighboring even elements.

package Assignment_1;

import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        waveSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void waveSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] < arr[i + 1]) {
                swap(arr, i, i + 1);
            }
            if (i > 0 && arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
            }
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}

// Time complexity - O(n)