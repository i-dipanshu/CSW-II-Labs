// Write a program to find all permutations of an integer list recursively.

package Assignment_1;

import java.util.*;

public class Q16 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        List<List<Integer>> permutations = findPermutations(nums);
        System.out.println(permutations); // prints [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1], [3, 1, 2]]
    }

    public static List<List<Integer>> findPermutations(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.isEmpty()) {
            return result;
        }
        permutationsHelper(nums, 0, result);
        return result;
    }

    private static void permutationsHelper(List<Integer> nums, int start, List<List<Integer>> result) {
        if (start == nums.size() - 1) {
            result.add(new ArrayList<>(nums));
            return;
        }
        for (int i = start; i < nums.size(); i++) {
            swap(nums, start, i);
            permutationsHelper(nums, start + 1, result);
            swap(nums, start, i);
        }
    }

    private static void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }
}
