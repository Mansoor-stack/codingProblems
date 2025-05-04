package Collections.Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator; // Import Comparator for custom ordering

public class PriorityQueueDemo {

    public static void main(String[] args) {

        System.out.println("--- PriorityQueue Demo (Ordered by Priority) ---");
        // PriorityQueue orders elements based on natural ordering or a provided Comparator.
        // It's typically implemented as a min-heap (smallest element has highest priority).
        // It does not permit null elements.

        // --- Declaration and Basic Operations (Natural Ordering - Min Heap) ---
        System.out.println("\n--- Natural Ordering (Min Heap) ---");
        Queue<Integer> minHeap = new PriorityQueue<>();

        // Adding elements (offer/add)
        minHeap.offer(30); // offer is generally preferred
        minHeap.add(10);
        minHeap.offer(50);
        minHeap.offer(20);
        // minHeap.offer(null); // Throws NullPointerException
        System.out.println("Min Heap PriorityQueue: " + minHeap);
        // Note: The internal array representation might not look sorted,
        // but the heap property ensures the head is always the minimum.

        // Examining the head element (peek/element)
        System.out.println("Head (peek - smallest): " + minHeap.peek()); // Returns null if empty. Expected: 10
        System.out.println("Head (element - smallest): " + minHeap.element()); // Throws exception if empty. Expected: 10

        // Removing the head element (poll/remove)
        System.out.println("Removed Head (poll): " + minHeap.poll()); // Returns null if empty. Expected: 10
        System.out.println("Min Heap after poll: " + minHeap);
        System.out.println("New Head (peek): " + minHeap.peek()); // Expected: 20

        System.out.println("Removed Head (remove): " + minHeap.remove()); // Throws exception if empty. Expected: 20
        System.out.println("Min Heap after remove: " + minHeap);
        System.out.println("New Head (peek): " + minHeap.peek()); // Expected: 30

        System.out.println("Size: " + minHeap.size());
        minHeap.clear();
        System.out.println("Is empty after clear? " + minHeap.isEmpty());


        // --- Declaration and Basic Operations (Custom Ordering - Max Heap) ---
        System.out.println("\n--- Custom Ordering (Max Heap using Comparator) ---");
        // Use a Comparator to create a max-heap (largest element has highest priority)
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        // Or using a lambda: Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        maxHeap.offer(30);
        maxHeap.offer(10);
        maxHeap.offer(50);
        maxHeap.offer(20);
        System.out.println("Max Heap PriorityQueue: " + maxHeap);

        // Examining the head element (peek)
        System.out.println("Head (peek - largest): " + maxHeap.peek()); // Expected: 50

        // Removing the head element (poll)
        System.out.println("Removed Head (poll): " + maxHeap.poll()); // Expected: 50
        System.out.println("Max Heap after poll: " + maxHeap);
        System.out.println("New Head (peek): " + maxHeap.peek()); // Expected: 30


        // --- PriorityQueue with Custom Objects ---
        System.out.println("\n--- PriorityQueue with Custom Objects (Task Example) ---");
        // Objects need to be Comparable or a Comparator must be provided.
        Queue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(Task::getPriority)); // Lower number = higher priority

        taskQueue.offer(new Task("High Priority Task", 1));
        taskQueue.offer(new Task("Low Priority Task", 10));
        taskQueue.offer(new Task("Medium Priority Task", 5));

        System.out.println("Task Queue: " + taskQueue);
        System.out.println("Highest Priority Task (peek): " + taskQueue.peek()); // Expected: Task with priority 1
        System.out.println("Processing task: " + taskQueue.poll());
        System.out.println("Next Task (peek): " + taskQueue.peek()); // Expected: Task with priority 5
    }

    // Example Custom Class (needs to be comparable or use Comparator)
    static class Task {
        private String name;
        private int priority; // Lower number means higher priority

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Task{" +
                   "name='" + name + '\'' +
                   ", priority=" + priority +
                   '}';
        }
    }
}
