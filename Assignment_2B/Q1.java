// Write a program to create an TreeSet of Integer type and perform the
// below operation on it.
// (a.) Display the TreeSet
// (b.) Ask the user to enter a number and search that number is it
// present in the list or not.
// (c.) Remove an element from tree.

package Assignment_2B;

import java.util.Scanner;
import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(3);
        treeSet.add(7);
        treeSet.add(12);
        treeSet.add(20);

        // (a). Display the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // (b). Search for an element
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int num = scanner.nextInt();
        if (treeSet.contains(num)) {
            System.out.println(num + " is present in the TreeSet.");
        } else {
            System.out.println(num + " is not present in the TreeSet.");
        }

        // (c). Remove an element
        System.out.print("Enter a number to remove: ");
        num = scanner.nextInt();
        if (treeSet.remove(num)) {
            System.out.println(num + " was removed from the TreeSet.");
            System.out.println("TreeSet elements after removal: " + treeSet);
        } else {
            System.out.println(num + " is not present in the TreeSet.");
        }
        
        scanner.close();
    }
}

