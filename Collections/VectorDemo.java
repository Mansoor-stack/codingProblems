package RoughNote;

import java.util.Vector;
import java.util.Arrays;

public class VectorDemo {

    public static void main(String[] args) {

        // --- Initialization ---
        // Vector is synchronized (thread-safe), ArrayList is not.
        // Generally, ArrayList is preferred for single-threaded performance.
        // If thread-safety is needed, consider Collections.synchronizedList(new ArrayList<>())
        // or concurrent collections like CopyOnWriteArrayList.
        Vector<Integer> numbers = new Vector<>();

        // --- Adding Elements ---
        // Methods are similar to ArrayList, but synchronized.
        numbers.add(10);
        numbers.add(20);
        numbers.addElement(30); // Legacy method, equivalent to add()
        System.out.println("Initial Vector: " + numbers);

        // --- Common List Methods ---
        // All standard List methods (get, set, remove, contains, indexOf, etc.) are available
        // and are synchronized in Vector.
        numbers.add(1, 15);
        System.out.println("After add(1, 15): " + numbers);
        System.out.println("Element at index 2: " + numbers.get(2)); // 20
        numbers.remove(Integer.valueOf(20)); // Remove by object value
        System.out.println("After remove(20): " + numbers);
        System.out.println("Contains 10: " + numbers.contains(10));
        System.out.println("Size: " + numbers.size());

        // --- Capacity ---
        // Vector has a capacity (internal array size) that grows automatically.
        // You can check capacity, but it's less common to manage directly.
        System.out.println("Capacity: " + numbers.capacity()); // Default initial capacity is often 10

        // --- Key Takeaway ---
        // Vector is a legacy class. Its main feature is synchronization on every method.
        // This synchronization adds overhead, making it slower than ArrayList in
        // non-concurrent scenarios. Modern applications usually favor ArrayList or
        // specialized concurrent collections.
    }
}
