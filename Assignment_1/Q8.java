// Given an array of size N, containing elements from 0 to N-1. All values
// from 0 to N-1 are present in array and if they are not there than -1 is
// there to take place. Write a program to arrange values of the array so
// that value i is stored at arr[i]

package Assignment_1;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 0, 3, 2, -1};
        arrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void arrangeArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < n && arr[i] != -1 && arr[i] != i) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
    }
}
