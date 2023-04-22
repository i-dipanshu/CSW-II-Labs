// Given an unsorted array, find the smallest positive number missing in
// the array

package Assignment_1;

import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = { -5, 3, 2, 0, -4, 1, -1, -6 };
        int smallestMissingNumber1 = getSmallestMissingNumber(arr);
        System.out.println(smallestMissingNumber1); // Output: 4
    }

    static int getSmallestMissingNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        int smallestMissingNumber = 0;
        while (set.contains(smallestMissingNumber)) {
            smallestMissingNumber++;
        }
        return smallestMissingNumber;
    }
}
