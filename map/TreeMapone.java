package map;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapone {
    public static void main(String[] args) {
        // Creating a TreeMap
        Map<String, Integer> ageMap = new TreeMap<>();

        // Adding key-value pairs
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 22);

        // Accessing values using keys (sorted order)
        System.out.println("Bob's age: " + ageMap.get("Bob"));

        // Iterating through the map
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + "'s age is " + entry.getValue());
        }

        // Checking if a key exists
        System.out.println("Contains key 'Alice': " + ageMap.containsKey("Alice"));

        // Checking if a value exists
        System.out.println("Contains value 22: " + ageMap.containsValue(22));

        // Size of the map
        System.out.println("Size: " + ageMap.size());
    }
}
