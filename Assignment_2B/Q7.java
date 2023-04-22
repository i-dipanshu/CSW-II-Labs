// Write a program to read N number from user and keep it in suitable
// data structure so that no duplicate element is present in that.

package Assignment_2B;

import java.util.HashSet;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            set.add(num);
        }

        scanner.close();

        System.out.println("The unique elements are:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
