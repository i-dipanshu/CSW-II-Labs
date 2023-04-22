// Write a program to create a hash map insert some element into it and
// display it.

package Assignment_2B;

import java.util.HashMap;

public class Q6 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Insert some elements into the HashMap
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.put("date", 4);
        map.put("elderberry", 5);

        // Display the HashMap
        System.out.println("HashMap elements: " + map);
    }
}
