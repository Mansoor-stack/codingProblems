package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        // ArrayDeque implements the Deque interface, allowing operations at both ends.
        // It can be used as a Queue (FIFO) or a Stack (LIFO).
        // It does not permit null elements.
        Deque<String> deque = new ArrayDeque<>();

        System.out.println("--- ArrayDeque Demo (Double-Ended Queue) ---");

        // --- Adding Elements ---
        System.out.println("\n--- Adding Elements ---");
        deque.addFirst("Item B"); // Adds to the front (throws exception if capacity restricted and full)
        deque.offerFirst("Item A"); // Adds to the front (returns false if capacity restricted and full) - Preferred
        deque.addLast("Item C");  // Adds to the end (throws exception)
        deque.offerLast("Item D"); // Adds to the end (returns false) - Preferred
        // deque.offerFirst(null); // Throws NullPointerException
        System.out.println("Deque after additions: " + deque); // Expected: [Item A, Item B, Item C, Item D]

        // --- Examining Elements (Peeking) ---
        System.out.println("\n--- Examining Elements (Peeking) ---");
        System.out.println("Peek First (peekFirst): " + deque.peekFirst()); // Retrieves head (returns null if empty)
        System.out.println("Peek Last (peekLast):   " + deque.peekLast());   // Retrieves tail (returns null if empty)
        // For Queue behavior (FIFO): peek() is equivalent to peekFirst()
        System.out.println("Peek (Queue head):    " + deque.peek());
        // For Stack behavior (LIFO): peek() is equivalent to peekFirst()
        System.out.println("Peek (Stack top):     " + deque.peek());


        // --- Examining Elements (Getting) ---
        System.out.println("\n--- Examining Elements (Getting - throws exception if empty) ---");
        try {
            System.out.println("Get First (getFirst): " + deque.getFirst()); // Retrieves head (throws NoSuchElementException if empty)
            System.out.println("Get Last (getLast):   " + deque.getLast());   // Retrieves tail (throws NoSuchElementException if empty)
             // For Queue behavior (FIFO): element() is equivalent to getFirst()
            System.out.println("Element (Queue head): " + deque.element());
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Deque state remains: " + deque);


        // --- Removing Elements (Polling) ---
        System.out.println("\n--- Removing Elements (Polling - returns null if empty) ---");
        System.out.println("Poll First (pollFirst): " + deque.pollFirst()); // Retrieves and removes head
        System.out.println("Deque after pollFirst: " + deque); // Expected: [Item B, Item C, Item D]
        System.out.println("Poll Last (pollLast):   " + deque.pollLast());   // Retrieves and removes tail
        System.out.println("Deque after pollLast:  " + deque); // Expected: [Item B, Item C]
        // For Queue behavior (FIFO): poll() is equivalent to pollFirst()
        System.out.println("Poll (Queue head):    " + deque.poll());
        System.out.println("Deque after poll:    " + deque); // Expected: [Item C]


        // --- Removing Elements (Removing - throws exception if empty) ---
        System.out.println("\n--- Removing Elements (Removing - throws exception if empty) ---");
        deque.offerFirst("Item X"); // Add one back for demonstration
        deque.offerLast("Item Y");
        System.out.println("Deque before removes: " + deque); // Expected: [Item X, Item C, Item Y]
        try {
            System.out.println("Remove First (removeFirst): " + deque.removeFirst()); // Retrieves and removes head
            System.out.println("Deque after removeFirst: " + deque); // Expected: [Item C, Item Y]
            System.out.println("Remove Last (removeLast):   " + deque.removeLast());   // Retrieves and removes tail
            System.out.println("Deque after removeLast:  " + deque); // Expected: [Item C]
            // For Queue behavior (FIFO): remove() is equivalent to removeFirst()
            System.out.println("Remove (Queue head):      " + deque.remove());
            System.out.println("Deque after remove:      " + deque); // Expected: []
            // Try removing from empty deque
            // System.out.println(deque.removeFirst()); // This would throw NoSuchElementException
        } catch (NoSuchElementException e) {
             System.out.println("Exception caught trying to remove from empty deque: " + e);
        }
        System.out.println("Is Deque empty? " + deque.isEmpty());


        // --- Using as Stack (LIFO) ---
        System.out.println("\n--- Using ArrayDeque as Stack (LIFO) ---");
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10); // push() is equivalent to addFirst()
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack); // Expected: [30, 20, 10] (30 is the top)
        System.out.println("Stack peek(): " + stack.peek()); // peek() equivalent to peekFirst() -> 30
        System.out.println("Stack pop(): " + stack.pop());   // pop() equivalent to removeFirst() -> 30
        System.out.println("Stack after pop: " + stack); // Expected: [20, 10]
        System.out.println("Stack size: " + stack.size());
    }
}
