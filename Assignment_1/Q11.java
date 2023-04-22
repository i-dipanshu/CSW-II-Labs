// Given an array you need to find the maximum sum of arr[i]*(i+1) for
// all elements such that you are allowed to rotate the array. 

package Assignment_1;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int maxSum = maxSum(arr);
        System.out.println(maxSum); // Output: 40
    }

    public static int maxSum(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        int currentSum = 0;

        // Finding the total sum and current sum of arr[i]*(i+1) for the original array
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            currentSum += i * arr[i];
        }

        int maxSum = currentSum;

        // Calculating the current sum and updating the maximum sum for all possible
        // rotations of the array
        for (int i = 1; i < n; i++) {
            currentSum = currentSum - totalSum + arr[i - 1] * (n - 1);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
