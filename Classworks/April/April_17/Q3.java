// 3) Given two arrays, sort the first array according to the order defined in the second array. 
// Example arr1 = {2,1,2,5,7,1,9,3,6,8,8} arr2 = {2,1,8,3} o/p {2,2,1,1,8,8,3,5,7,9,6}


package Classworks.April.April_17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] arr2 = {2, 1, 8, 3};

        int[] sortedArr = sortByOrder(arr1, arr2);

        System.out.println("Sorted Array: " + Arrays.toString(sortedArr));
    }

    public static int[] sortByOrder(int[] arr1, int[] arr2) {
        // Count the frequency of each element in arr1
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int[] sortedArr = new int[arr1.length];
        int i = 0;

        // Iterate through arr2 in order and add corresponding elements from hashmap to sorted array
        for (int num : arr2) {
            int freq = freqMap.getOrDefault(num, 0);
            while (freq > 0) {
                sortedArr[i++] = num;
                freq--;
            }
            freqMap.remove(num);
        }

        // Add remaining elements from hashmap to sorted array in any order
        for (int num : freqMap.keySet()) {
            int freq = freqMap.get(num);
            while (freq > 0) {
                sortedArr[i++] = num;
                freq--;
            }
        }
        return sortedArr;
    }
}
