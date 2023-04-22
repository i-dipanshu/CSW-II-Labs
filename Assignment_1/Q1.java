// Write a program to check whether a number is prime or not.
// Calculate its time complexity with proper explanation.

package Assignment_1;

public class Q1 {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(number + " ---> " + isPrime(number));
    }

    static boolean isPrime(int number) {
        if (number <= 1) return false;

        int sqrt = (int) Math.sqrt(number);

        while (sqrt >= 2) {
            if (number % sqrt == 0) {
                return false;
            }
            sqrt--;
        }
        return true;
    }
}

// Time complexity - O(n)
