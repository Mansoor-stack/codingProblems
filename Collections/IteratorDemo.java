package RoughNote;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {

        // 1. Setup: Create a List (ArrayList used here)
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green"); // Duplicate for removal test

        System.out.println("Original List: " + colors);
        System.out.println("-------------------------------------");

        // 2. Get an Iterator
        // iterator() method is defined in the Iterable interface (which Collection extends)
        Iterator<String> iterator = colors.iterator();

        // 3. Basic Traversal (using hasNext() and next())
        System.out.println("Basic Traversal with Iterator:");
        // hasNext(): Returns true if the iteration has more elements.
        while (iterator.hasNext()) {
            // next(): Returns the next element in the iteration and advances the cursor.
            String color = iterator.next();
            System.out.println("  - " + color);
            // Attempting to call remove() without calling next() first would cause IllegalStateException
            // iterator.remove(); // WRONG here
        }
        // Note: The iterator is now exhausted (cursor is at the end).
        // Trying to call next() again would throw NoSuchElementException.
        // System.out.println(iterator.next()); // Throws Exception

        System.out.println("-------------------------------------");

        // 4. Traversal with Removal (using remove())
        //    - remove() removes the *last element returned* by the most recent call to next().
        //    - Must call next() *before* each call to remove().
        //    - Can only call remove() *once* per call to next().
        System.out.println("Traversal with Removal (Removing first 'Green'):");

        // Get a *new* iterator to start from the beginning again
        Iterator<String> removalIterator = colors.iterator();
        while (removalIterator.hasNext()) {
            String color = removalIterator.next(); // Get element & advance
            if (color.equals("Green")) {
                System.out.println("  -> Found 'Green', removing it.");
                removalIterator.remove(); // Remove the "Green" just returned by next()
                // removalIterator.remove(); // Calling remove() again here -> IllegalStateException
                break; // Stop after removing the first occurrence for this demo
            } else {
                System.out.println("  - Kept: " + color);
            }
        }
        System.out.println("List after removal: " + colors);
        System.out.println("-------------------------------------");

        // 5. ConcurrentModificationException Example (DON'T DO THIS)
        System.out.println("Demonstrating ConcurrentModificationException:");
        Iterator<String> concurrentIterator = colors.iterator();
        try {
            while (concurrentIterator.hasNext()) {
                String color = concurrentIterator.next();
                System.out.println("  - Processing: " + color);
                if (color.equals("Blue")) {
                    System.out.println("  -> Modifying list directly while iterating (BAD!)");
                    colors.add("Purple"); // Modifying the list directly, not via iterator.remove()
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("  Caught Expected Exception: " + e);
        }
        System.out.println("List state after attempted modification: " + colors); // State might be unpredictable
        System.out.println("-------------------------------------");


        // 6. Using forEachRemaining() (Java 8+)
        //    - Executes the given action for each *remaining* element in the iterator.
        //    - Useful if you only need to process elements from the current position onwards.
        System.out.println("Using forEachRemaining() (on a fresh iterator):");
        Iterator<String> feIterator = colors.iterator(); // Get a new iterator
        // Optional: Advance the iterator partially
        if (feIterator.hasNext()) {
             System.out.println("  Skipping first element: " + feIterator.next()); // Skip "Red"
        }
        System.out.println("  Processing remaining elements with forEachRemaining:");
        // Use a lambda expression for the action
        feIterator.forEachRemaining(color -> System.out.println("    -> " + color));
        // Note: The iterator is now exhausted after forEachRemaining finishes.
        System.out.println("-------------------------------------");
    }
}
