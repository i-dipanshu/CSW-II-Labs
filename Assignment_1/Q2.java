// Write a program to find the binary equivalent of a decimal number.
// Calculate its time complexity.

package Assignment_1;

public class Q2 {
    public static void main(String[] args) {
        int decimal = 5;
        decimalToBinary(decimal);
    }
    
    static void decimalToBinary(int decimal) {
        String binary = "";
        
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        System.out.println("The binary equivalent is: " + binary);
    }
}

// Time complexity = O(log n)