// Write a java program to convert a decimal to binary equivalent using
// stack(Stack collection).

package Assignment_2A;

import java.util.Scanner;
import java.util.Stack;

public class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        decimalToBinary(decimal);
        scanner.close();
    }

    private static void decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        while (decimal != 0) {
            int rem = decimal % 2;
            stack.push(rem);
            decimal /= 2;
        }

        System.out.print("Binary equivalent: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
