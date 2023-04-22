// Given a sorted array, rearrange it in maximum-minimum form.

package Assignment_1;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        // maxMinArrangement(arr);
        maxMin(arr);
        System.out.println(Arrays.toString(arr)); // prints [7, 1, 6, 2, 5, 3, 4]
    }

    public static void maxMin(int[] arr) {
        int[] firstHalf = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] secondHalf = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        for (int i = 0, j = secondHalf.length - 1, k = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = secondHalf[j--];
            } else {
                arr[i] = firstHalf[k++];
            }
        }
    }

    // in-place rearrange
    public static void maxMinArrangement(int[] arr) {
        int n = arr.length;
        int max_idx = n - 1;
        int min_idx = 0;
        int max_elem = arr[n - 1] + 1; // to store any element greater than maximum element in arr

        for (int i = 0; i < n; i++) {
            // for even indices, put the maximum element at that index
            if (i % 2 == 0) {
                arr[i] += (arr[max_idx] % max_elem) * max_elem;
                max_idx--;
            }
            // for odd indices, put the minimum element at that index
            else {
                arr[i] += (arr[min_idx] % max_elem) * max_elem;
                min_idx++;
            }
        }

        // divide all elements by max_elem to get the original elements
        for (int i = 0; i < n; i++) {
            arr[i] /= max_elem;
        }
    }
}
