package Collections.List;

import java.util.LinkedList;
import java.util.Arrays;

public class LinkedListDemo {

    public static void main(String[] args) {

        // --- Initialization ---
        // LinkedList implements List, Queue, Deque interfaces
        LinkedList<String> places = new LinkedList<>();

        // --- Adding Elements (Common List methods work too) ---
        places.add("Paris");
        places.add("Tokyo");
        places.add(1, "London"); // Add at index
        System.out.println("Initial List: " + places);

        // --- LinkedList Specific Additions (Deque interface methods) ---
        places.addFirst("New York"); // Adds to the beginning
        places.addLast("Sydney");    // Adds to the end (same as add())
        System.out.println("After addFirst/addLast: " + places);

        // --- Accessing Elements (Common List methods work too) ---
        System.out.println("Element at index 2 (get(2)): " + places.get(2)); // "Tokyo"

        // --- LinkedList Specific Access (Deque interface methods) ---
        System.out.println("First element (getFirst()): " + places.getFirst()); // "New York"
        System.out.println("Last element (getLast()): " + places.getLast());   // "Sydney"

        // --- Removing Elements (Common List methods work too) ---
        places.remove(3); // Removes element at index 3 ("London")
        System.out.println("After remove(3): " + places);

        // --- LinkedList Specific Removals (Deque interface methods) ---
        String firstRemoved = places.removeFirst(); // Removes and returns "New York"
        String lastRemoved = places.removeLast();   // Removes and returns "Sydney"
        System.out.println("After removeFirst/removeLast: " + places);
        System.out.println("Removed first: " + firstRemoved + ", Removed last: " + lastRemoved);

        // --- Other common List methods (demonstrated in ArrayListDemo) also work ---
        System.out.println("Contains 'Paris': " + places.contains("Paris"));
        System.out.println("Index of 'Tokyo': " + places.indexOf("Tokyo"));
        System.out.println("Size: " + places.size());

        // --- Use Cases ---
        // LinkedList is efficient for frequent insertions/deletions, especially at the ends.
        // Often used when implementing Stacks or Queues.
        // Can be less efficient than ArrayList for random access using get(index).
    }
}
