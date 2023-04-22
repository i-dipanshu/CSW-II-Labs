// Write a recursive function to search an element using binary search.

package Assignment_1;

import java.util.Arrays;

public class Q17 {

    public static void main(String[] args) {
        int[] arr = { 11, 2, 34, -5, 6, 7, 8 };
        System.out.println(binarySearch(arr, 6) > 0 ? "Target Found " : "404 Not Found");
    }

    public static int binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        return binarySearchHelper(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchHelper(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchHelper(arr, target, left, mid - 1);
        } else {
            return binarySearchHelper(arr, target, mid + 1, right);
        }
    }
}
