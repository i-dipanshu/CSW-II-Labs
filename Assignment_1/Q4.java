// Write a program to search an element using binary search and calculate
// its time complexity.

package Assignment_1;

public class Q4 {
    public static void main(String[] args) {
        // sorted array 
        int[] arr = { 13, 14, 15, 16, 17 };
        int target = 15;
        // return -1 if not found else the index of target
        int index = binarySearch(arr, target);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
