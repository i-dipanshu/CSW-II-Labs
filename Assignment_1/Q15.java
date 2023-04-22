// Write a recursive function to find the GCD of two numbers. Write the
// recurrence of the function and solve it for a solution.

package Assignment_1;

public class Q15 {
    public static void main(String[] args) {
        System.out.println(gcd(21, 3));
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

// Time complexity =  O(log min(a, b))
