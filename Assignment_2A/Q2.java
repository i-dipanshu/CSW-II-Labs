// Create a class Student having member variable name, age, mark and
// required member variable. Create an LikedList of Student type and
// perform the below operation on it.
// (a.) Display the list
// (b.) Ask the user to enter a student object and print the existence of
// the object. Specify is the object is search according to reference
// or contain.
// (c.) Remove an specified student object.
// (d.) Count the number of object present in the list.

package Assignment_2A;

import java.util.LinkedList;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("John", 18, 80, true));
        students.add(new Student("Mary", 19, 90, false));
        students.add(new Student("Bob", 20, 70, true));
        students.add(new Student("Alice", 21, 85, false));

        // (a.) Display the list
        System.out.println("List of students:");
        for (Student s : students) {
            System.out.println(s);
        }

        // (b.) Ask the user to enter a student object and print the existence of the object.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name to search: ");
        String name = scanner.nextLine();
        System.out.print("Search by reference or contain? ");
        String searchType = scanner.nextLine();
        boolean found = false;
        for (Student s : students) {
            if (searchType.equals("reference")) {
                if (s.name == name) {
                    found = true;
                    break;
                }
            } else if (searchType.equals("contain")) {
                if (s.name.contains(name)) {
                    found = true;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("Student exists.");
        } else {
            System.out.println("Student does not exist.");
        }

        // (c.) Remove a specified student object.
        System.out.print("Enter student name to remove: ");
        name = scanner.nextLine();
        for (Student s : students) {
            if (s.name.equals(name)) {
                students.remove(s);
                break;
            }
        }
        System.out.println("List of students after removal:");
        for (Student s : students) {
            System.out.println(s);
        }

        // (d.) Count the number of object present in the list.
        int count = students.size();
        System.out.println("Number of students in the list: " + count);

        scanner.close();
    }
}

class Student {
    String name;
    int age;
    int mark;
    boolean required;

    public Student(String name, int age, int mark, boolean required) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.required = required;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Mark: " + mark + ", Required: " + required;
    }
}