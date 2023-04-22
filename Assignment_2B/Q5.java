// Write a program to create a linked hash set of type double insert some
// element into it and display it.

package Assignment_2B;

import java.util.LinkedHashSet;

public class Q5 {
    public static void main(String[] args) {
        // Create a LinkedHashSet of type double
        LinkedHashSet<Double> doubleSet = new LinkedHashSet<>();

        // Insert some elements into the LinkedHashSet
        doubleSet.add(1.0);
        doubleSet.add(2.5);
        doubleSet.add(3.7);
        doubleSet.add(4.2);
        doubleSet.add(5.9);

        // Display the LinkedHashSet
        System.out.println("LinkedHashSet elements: " + doubleSet);
    }
}
