// Given an array of positive and negative integers, write a program to
// find a contiguous sub-array whose sum of elements is maximum

package Assignment_1;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -1, 4, };
        System.out.println(Arrays.toString(maxSubArray(arr)));
    }

    public static int[] maxSubArray(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        int start = 0;
        int end = 0;
        int maxStart = 0;
        int maxEnd = 0;

        for (int i = 1; i < arr.length; i++) {
            if (maxEndingHere + arr[i] < arr[i]) {
                maxEndingHere = arr[i];
                start = i;
                end = i;
            } else {
                maxEndingHere += arr[i];
                end = i;
            }
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
                maxStart = start;
                maxEnd = end;
            }
        }
        return Arrays.copyOfRange(arr, maxStart, maxEnd + 1);
    }
}

// Time complexity - O(n)