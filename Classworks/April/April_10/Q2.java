// Given an array containing 0s and 1s. 
// Write a Java program to sort the array so that 0s come first followed by 1s in linear time.

package Classworks.April.April_10;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0 };
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        sort01(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void sort01(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Find the first 1 from the left
            while (left < right && arr[left] == 0) {
                left++;
            }

            // Find the first 0 from the right
            while (left < right && arr[right] == 1) {
                right--;
            }

            // Swap the 0 and 1
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }
}
