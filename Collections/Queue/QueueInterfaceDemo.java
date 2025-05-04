package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.NoSuchElementException;

public class QueueInterfaceDemo {

    public static void main(String[] args) {

        // Demonstrating core Queue interface methods using LinkedList implementation.
        // LinkedList implements Queue and allows null elements.
        Queue<String> queue = new LinkedList<>();

        System.out.println("--- Core Queue Interface Methods Demo (using LinkedList) ---");

        // --- Adding Elements ---
        System.out.println("\n--- Adding Elements (add vs offer) ---");
        // offer(E e): Inserts the specified element into this queue if possible without violating capacity restrictions.
        // Returns true upon success and false if no space is currently available. Preferred method.
        System.out.println("Offer 'Apple': " + queue.offer("Apple"));
        System.out.println("Offer 'Banana': " + queue.offer("Banana"));
        // add(E e): Inserts the specified element into this queue.
        // Throws an IllegalStateException if no space is currently available (for capacity-restricted queues).
        try {
            System.out.println("Add 'Orange': " + queue.add("Orange")); // Returns true on success
             queue.offer(null); // LinkedList allows one null
             System.out.println("Offer null: true");
        } catch (IllegalStateException e) {
            System.out.println("Caught exception trying to add: " + e);
        } catch (NullPointerException e) {
             System.out.println("Caught exception trying to add null (if implementation forbids it): " + e);
        }
        System.out.println("Queue after additions: " + queue); // Expected: [Apple, Banana, Orange, null]


        // --- Examining the Head Element ---
        System.out.println("\n--- Examining Head Element (element vs peek) ---");
        // peek(): Retrieves, but does not remove, the head of this queue.
        // Returns null if this queue is empty. Preferred method.
        System.out.println("Peek head: " + queue.peek()); // Expected: Apple
        // element(): Retrieves, but does not remove, the head of this queue.
        // Throws a NoSuchElementException if this queue is empty.
        try {
            System.out.println("Element head: " + queue.element()); // Expected: Apple
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception trying to get element: " + e);
        }
        System.out.println("Queue state remains: " + queue);


        // --- Removing the Head Element ---
        System.out.println("\n--- Removing Head Element (remove vs poll) ---");
        // poll(): Retrieves and removes the head of this queue.
        // Returns null if this queue is empty. Preferred method.
        System.out.println("Poll head: " + queue.poll()); // Expected: Apple
        System.out.println("Queue after poll: " + queue); // Expected: [Banana, Orange, null]
        // remove(): Retrieves and removes the head of this queue.
        // Throws a NoSuchElementException if this queue is empty.
        try {
            System.out.println("Remove head: " + queue.remove()); // Expected: Banana
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception trying to remove: " + e);
        }
        System.out.println("Queue after remove: " + queue); // Expected: [Orange, null]

        // --- Behavior with Empty Queue ---
        System.out.println("\n--- Behavior with Empty Queue ---");
        queue.clear();
        System.out.println("Queue after clear: " + queue);
        System.out.println("Is empty? " + queue.isEmpty());

        // Methods returning special values
        System.out.println("Peek on empty queue: " + queue.peek()); // Expected: null
        System.out.println("Poll on empty queue: " + queue.poll()); // Expected: null
        // System.out.println("Offer on capacity-restricted full queue would return: false"); // (LinkedList is not capacity-restricted by default)

        // Methods throwing exceptions
        try {
            queue.element();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception calling element() on empty queue: " + e);
        }
        try {
            queue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception calling remove() on empty queue: " + e);
        }
        // try { queue.add("Element"); } catch (IllegalStateException e) { System.out.println("Caught exception calling add() on full queue: " + e); } // (LinkedList not capacity-restricted)

    }
}
