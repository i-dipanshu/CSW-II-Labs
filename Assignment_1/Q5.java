// Given an array, write a program to rotate its element K numbers of
// times. Explain its time complexity.

package Assignment_1;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        System.out.println(Arrays.toString(rotateArray(arr, k)));
    }

    private static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n];

        int mod = k % n; // left rotation
        // int mod = n - k % n; // right rotation

        for (int i = 0; i < n; i++) {
            ans[i] = arr[(i + mod) % n];
        }
        return ans;
    }
}

// Time Comp = O(n)