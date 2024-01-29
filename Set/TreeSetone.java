import java.util.Set;
import java.util.TreeSet;

public class TreeSetone {
    public static void main(String[] args) {
        // Creating a TreeSet
        Set<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);

        // Accessing elements (naturally sorted order)
        System.out.println("Numbers: " + numbers);

        // Removing an element
        numbers.remove(2);

        // Checking if an element exists
        System.out.println("Contains 2: " + numbers.contains(2));

        // Size of the set
        System.out.println("Size: " + numbers.size());
    }
}

