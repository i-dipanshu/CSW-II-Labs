// Write a java program to evaluate a postfix expression using Stack.

package Assignment_2A;

import java.util.Stack;

public class Q4 {
    public static void main(String[] args) {
        String exp = "52+3*4/";
        postfix(exp);
    }

    private static void postfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = evaluate(operand1, operand2, ch);
                stack.push(result);
            }
        }

        int result = stack.pop();
        System.out.println("Result: " + result);
    }

    private static int evaluate(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            case '%':
                return operand1 % operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
