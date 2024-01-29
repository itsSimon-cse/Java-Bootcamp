import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetone {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        Set<String> colors = new LinkedHashSet<>();

        // Adding elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Accessing elements (order of insertion)
        System.out.println("Colors: " + colors);

        // Removing an element
        colors.remove("Green");

        // Checking if an element exists
        System.out.println("Contains 'Green': " + colors.contains("Green"));

        // Size of the set
        System.out.println("Size: " + colors.size());
    }
}
