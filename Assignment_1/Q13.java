// Given two arrays in increasing order you need to find the maximum
// sum by choosing a few consecutive elements from one array and then
// a few elements from another array. The element switching can happen
// at transition points only when the element value is the same in both
// arrays

package Assignment_1;

public class Q13 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 5, 7, 9 };
        int[] arr2 = { 2, 3, 4, 6 };
        int maxSum = maxSum(arr1, arr2);
        System.out.println(maxSum); // output: 31
    }

    public static int maxSum(int[] arr1, int[] arr2) {
        int i = 0, j = 0, sum1 = 0, sum2 = 0, maxSum = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                // Switch at transition point
                maxSum += Math.max(sum1, sum2) + arr1[i];
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            }
        }

        // Add remaining elements from arr1, if any
        while (i < arr1.length) {
            sum1 += arr1[i++];
        }

        // Add remaining elements from arr2, if any
        while (j < arr2.length) {
            sum2 += arr2[j++];
        }

        // Add maximum of sum1 and sum2 to maxSum
        maxSum += Math.max(sum1, sum2);

        return maxSum;
    }

}
