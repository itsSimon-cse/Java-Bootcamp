package map;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapone {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        Map<String, Integer> ageMap = new LinkedHashMap<>();

        // Adding key-value pairs
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 22);

        // Accessing values using keys (order of insertion)
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
