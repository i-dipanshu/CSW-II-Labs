// Given two unsorted arrays, find the union and intersection of these two arrays.

package Classworks.April.April_17;

import java.util.Arrays;
import java.util.HashSet;

public class Q4 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 4, 7, 8, 9 };
        int[] arr2 = { 5, 2, 3, 9, 1 };

        // Find the union of the two arrays
        int[] union = getUnion(arr1, arr2);
        System.out.println("Union of arr1 and arr2: " + Arrays.toString(union));

        // Find the intersection of the two arrays
        int[] intersection = getIntersection(arr1, arr2);
        System.out.println("Intersection of arr1 and arr2: " + Arrays.toString(intersection));
    }

    public static int[] getUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of arr1 to the set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Add all elements of arr2 to the set
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        // Convert set to array
        int[] union = new int[set.size()];
        int i = 0;
        for (int num : set) {
            union[i++] = num;
        }

        return union;
    }

    public static int[] getIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add all elements of arr1 to the set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Check if elements of arr2 are present in the set
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                intersectionSet.add(arr2[i]);
            }
        }

        // Convert set to array
        int[] intersection = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            intersection[i++] = num;
        }

        return intersection;
    }
}
