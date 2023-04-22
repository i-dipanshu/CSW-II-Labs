// Write a program to find the reverse of a number 
// and find its time complexity.

package Assignment_1;

public class Q3 {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverse(num));
    }

    static int reverse(int num) {
        int result = 0;

        while (num > 0) {
            result = result*10 + num % 10;
            num /= 10;
        }
        return result;
    }
}

// Time complexity = O(log n)
