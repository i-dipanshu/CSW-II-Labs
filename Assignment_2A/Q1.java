// Write a program to create an ArrayList of Integer type and perform
// the below operation on it.
// (a.) Display the list
// (b.) Ask the user to enter a number and search that number is it
// present in the list or not.
// (c.) Remove an element from an asked position.
// (d.) Add a condition to check the ArrayList is empty or not.

package Assignment_2A;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Displaying the list
        System.out.println("List: " + list);

        // Checking if the list is empty
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            // Asking the user to enter a number to search in the list
            System.out.print("Enter a number to search: ");
            int searchNum = sc.nextInt();

            // Searching for the number in the list
            if (list.contains(searchNum)) {
                System.out.println(searchNum + " is present in the list.");
            } else {
                System.out.println(searchNum + " is not present in the list.");
            }

            // Asking the user to enter the position of the element to remove
            System.out.print("Enter the position of the element to remove: ");
            int removeIndex = sc.nextInt();

            // Removing the element at the given position
            if (removeIndex < 0 || removeIndex >= list.size()) {
                System.out.println("Invalid position. No element removed.");
            } else {
                int removedElement = list.remove(removeIndex);
                System.out.println("Removed element: " + removedElement);
            }

            // Displaying the updated list
            System.out.println("Updated List: " + list);
        }
        sc.close();
    }
}
