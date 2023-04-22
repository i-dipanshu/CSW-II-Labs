// Write a Java program to implement counting sort for a given range of values.

package Classworks.April.April_18;

import java.util.Arrays;

public class Q1 {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, -1, 2, 3, 1, 1, 5, 2, 4, 0, -5, 2};
        int[] sortedArr = countingSort(arr, -5, 5);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array using Counting Sort: " + Arrays.toString(sortedArr));
    }

    public static int[] countingSort(int[] arr, int min, int max) {
        // Handling negative numbers
        int offset = 0;
        if (min < 0) {
            offset = Math.abs(min);
            max += offset;
        }

        // Creating a count array to store the frequency of each element
        int[] count = new int[max - min + 1];

        // Storing the frequency of each element in the count array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] + offset]++;
        }

        // Updating the count array to store the cumulative frequency of each element
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Creating a sorted array to store the sorted elements
        int[] sortedArr = new int[arr.length];

        // Placing the elements in the sorted array based on their cumulative frequency
        for (int i = arr.length - 1; i >= 0; i--) {
            sortedArr[count[arr[i] + offset] - 1] = arr[i];
            count[arr[i] + offset]--;
        }

        return sortedArr;
    }
}
