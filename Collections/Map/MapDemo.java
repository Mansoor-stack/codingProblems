package Collections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry; // Correct import for Map.Entry

public class MapDemo {

    public static void main(String[] args) {
        System.out.println("--- HashMap Demo (Unordered) ---");
        // HashMap: Does not maintain insertion order, allows one null key and multiple null values.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Orange", 15);
        hashMap.put("Grapes", 25);
        hashMap.put(null, 5); // Allows one null key
        hashMap.put("Mango", null); // Allows null values
        hashMap.put("Berry", null);

        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for 'Orange': " + hashMap.get("Orange"));
        System.out.println("Contains key 'Banana'? " + hashMap.containsKey("Banana"));
        System.out.println("Contains value 20? " + hashMap.containsValue(20));
        System.out.println("Removed 'Grapes': " + hashMap.remove("Grapes"));
        System.out.println("HashMap after removal: " + hashMap);
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
        System.out.println("Entries:");
        for (Entry<String, Integer> entry : hashMap.entrySet()) { // Use Entry from Map
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("Size: " + hashMap.size());
        System.out.println("Is empty? " + hashMap.isEmpty());
        hashMap.clear();
        System.out.println("HashMap after clear: " + hashMap);

        System.out.println("\n--- LinkedHashMap Demo (Insertion Order) ---");
        // LinkedHashMap: Maintains insertion order.
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);
        linkedHashMap.put(null, 0); // Allows one null key
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("Iterating keeping insertion order:");
        for (Entry<String, Integer> entry : linkedHashMap.entrySet()) { // Use Entry from Map
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }


        System.out.println("\n--- TreeMap Demo (Sorted Order) ---");
        // TreeMap: Maintains natural sorting order of keys (or custom order using Comparator). Does not allow null keys.
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 100);
        treeMap.put("Ant", 50);
        treeMap.put("Cat", 75);
        treeMap.put("Dog", 60);
        // treeMap.put(null, 10); // Throws NullPointerException
        treeMap.put("Elephant", null); // Allows null values
        System.out.println("TreeMap: " + treeMap);
        System.out.println("Iterating in natural key order:");
         for (Entry<String, Integer> entry : treeMap.entrySet()) { // Use Entry from Map
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n--- Hashtable Demo (Synchronized, Unordered) ---");
        // Hashtable: Synchronized (thread-safe), does not allow null keys or null values. Legacy class.
        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("X", 10);
        hashtable.put("Y", 20);
        hashtable.put("Z", 30);
        // hashtable.put(null, 5); // Throws NullPointerException
        // hashtable.put("A", null); // Throws NullPointerException
        System.out.println("Hashtable: " + hashtable);
         for (Entry<String, Integer> entry : hashtable.entrySet()) { // Use Entry from Map
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
