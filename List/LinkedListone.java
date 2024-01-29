package List;
import java.util.LinkedList;
import java.util.List;

public class LinkedListone {
    public static void main(String[] args) {
        // Creating a LinkedList
        List<Integer> numbers = new LinkedList<>();

        // Adding elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Accessing elements
        System.out.println("Numbers: " + numbers);

        // Iterating through the list
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Removing an element
        numbers.remove(Integer.valueOf(2));

        // Checking if an element exists
        System.out.println("Contains 2: " + numbers.contains(2));

        // Size of the list
        System.out.println("Size: " + numbers.size());
    }
}
