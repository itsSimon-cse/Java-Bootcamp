package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListone {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("Fruits: " + fruits);
        //System.out.println("added fruits");
        // Iterating through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element
        fruits.remove("Banana");

        // Checking if an element exists
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));

        // Size of the list
        System.out.println("Size: " + fruits.size());
    }
}
