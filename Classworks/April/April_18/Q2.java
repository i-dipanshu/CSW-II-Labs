// Write a Java program to implement bucket sort.

package Classworks.April.April_18;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Double[] arr = { 0.25, 0.75, 0.10, 0.90, 0.45, 0.30, 0.60, 0.15 };
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        bucketSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void bucketSort(Double[] arr) {
        if (arr.length == 0) {
            return;
        }

        // Find maximum value in the array
        double maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        // Create the buckets
        int bucketCount = arr.length;
    
        @SuppressWarnings("unchecked")
        ArrayList<Double>[] buckets = new ArrayList[bucketCount];
        for (int i = 0; i < bucketCount; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Add values to the buckets
        for (int i = 0; i < arr.length; i++) {
            int bucketIndex = (int) Math.floor((arr[i] * bucketCount) / (maxVal + 1));
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort the values in each bucket
        for (int i = 0; i < bucketCount; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate the sorted buckets into the final array
        int index = 0;
        for (int i = 0; i < bucketCount; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }
}
