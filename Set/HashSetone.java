package Set;
import java.util.HashSet;
import java.util.Set;

public class HashSetone {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("Fruits: " + fruits);

        // Removing an element
        fruits.remove("Banana");

        // Checking if an element exists
        System.out.println("Contains 'Banana': " + fruits.contains("Banana"));

        // Size of the set
        System.out.println("Size: " + fruits.size());
    }
}
