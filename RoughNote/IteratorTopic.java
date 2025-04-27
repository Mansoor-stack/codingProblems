package RoughNote;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTopic {

    public static void main(String[] args) {

        // 1. Setup: Create a List (ArrayList used here)
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");

        System.out.println("Original List: " + fruits);
        System.out.println("-------------------------------------");

        // 2. Get an Iterator
        Iterator<String> iterator = fruits.iterator();

        // 3. Basic Traversal (using hasNext() and next())
        System.out.println("Basic Traversal with Iterator:");
        while (iterator.hasNext()) {
            String fruit = iterator.next(); // Get the next element and advance the cursor
            System.out.println("  - " + fruit);
        }
        // Note: The iterator is now at the end of the list.
        System.out.println("-------------------------------------");

        // 4. Traversal with Removal (using remove())
        //    - remove() removes the *last element returned* by next().
        //    - Must call next() before calling remove().
        System.out.println("Traversal with Removal (Removing 'Orange'):");
        // Get a *new* iterator to start from the beginning again
        iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("Orange")) {
                iterator.remove(); // Remove the element just returned by next()
                System.out.println("  -> Removed 'Orange'");
            } else {
                System.out.println("  - Kept: " + fruit);
            }
        }
        System.out.println("List after removal: " + fruits);
        System.out.println("-------------------------------------");

        // 5. Using forEachRemaining()
        //    - Executes the given action for each *remaining* element in the iterator.
        System.out.println("Using forEachRemaining() (from the beginning):");
        // Get a *new* iterator
        iterator = fruits.iterator();
        // Optional: Advance the iterator partially
        // if (iterator.hasNext()) {
        //     System.out.println("  Skipping first element: " + iterator.next());
        // }
        System.out.println("  Processing remaining elements:");
        iterator.forEachRemaining(fruit -> System.out.println("    -> " + fruit));
        // Note: The iterator is now at the end after forEachRemaining finishes.
        System.out.println("-------------------------------------");
    }
}
