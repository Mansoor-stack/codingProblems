package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class SetDemo {

    public static void main(String[] args) {
        System.out.println("--- HashSet Demo (Unordered, Unique Elements) ---");
        // HashSet: Does not maintain insertion order, stores unique elements. Allows one null value.
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple"); // Duplicate, will be ignored
        hashSet.add(null);    // Allows one null value
        hashSet.add("Grapes");

        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains 'Orange'? " + hashSet.contains("Orange"));
        System.out.println("Removed 'Banana'? " + hashSet.remove("Banana"));
        System.out.println("HashSet after removal: " + hashSet);
        System.out.println("Size: " + hashSet.size());
        System.out.println("Is empty? " + hashSet.isEmpty());

        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }

        hashSet.clear();
        System.out.println("HashSet after clear: " + hashSet);


        System.out.println("\n--- LinkedHashSet Demo (Insertion Order, Unique Elements) ---");
        // LinkedHashSet: Maintains insertion order, stores unique elements. Allows one null value.
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("One"); // Duplicate
        linkedHashSet.add(null);   // Allows one null
        linkedHashSet.add("Four");

        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("Iterating (maintains insertion order):");
        for (String item : linkedHashSet) {
            System.out.println("  " + item);
        }


        System.out.println("\n--- TreeSet Demo (Sorted Order, Unique Elements) ---");
        // TreeSet: Maintains natural sorting order (or custom order using Comparator), stores unique elements. Does not allow null values.
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Ant");
        treeSet.add("Cat");
        treeSet.add("Dog");
        treeSet.add("Ant"); // Duplicate
        // treeSet.add(null); // Throws NullPointerException

        System.out.println("TreeSet: " + treeSet);
        System.out.println("Iterating (maintains natural sorted order):");
        for (String item : treeSet) {
            System.out.println("  " + item);
        }

        // Common Set operations (demonstrated on TreeSet)
        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("Cat");
        anotherSet.add("Elephant");

        System.out.println("Contains all elements of anotherSet? " + treeSet.containsAll(anotherSet)); // false

        // Retain only elements present in anotherSet (Intersection)
        // treeSet.retainAll(anotherSet);
        // System.out.println("TreeSet after retainAll: " + treeSet); // [Cat]

        // Add all elements from anotherSet (Union)
        treeSet.addAll(anotherSet);
        System.out.println("TreeSet after addAll: " + treeSet); // [Ant, Cat, Dog, Elephant, Zebra]

        // Remove all elements present in anotherSet (Difference)
        // treeSet.removeAll(anotherSet);
        // System.out.println("TreeSet after removeAll: " + treeSet); // [Ant, Dog, Zebra]
    }
}
