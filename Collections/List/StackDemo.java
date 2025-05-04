package Collections.List;

import java.util.Stack; // Import Stack class
import java.util.EmptyStackException;

public class StackDemo {

    public static void main(String[] args) {

        // --- Initialization ---
        // Stack extends Vector, so it's synchronized and somewhat legacy.
        // For non-synchronized stack behavior, ArrayDeque is generally preferred.
        // Stack implements Last-In, First-Out (LIFO).
        Stack<String> bookStack = new Stack<>();

        // --- Pushing Elements (Adding to the top) ---
        // push(item): Adds an item onto the top of this stack.
        bookStack.push("The Hobbit");
        bookStack.push("Dune");
        bookStack.push("Foundation");
        System.out.println("Stack after pushes: " + bookStack); // Top is the rightmost element

        // --- Peeking at the Top Element ---
        // peek(): Looks at the object at the top of this stack without removing it.
        try {
            String topBook = bookStack.peek();
            System.out.println("Top book (peek()): " + topBook); // "Foundation"
            System.out.println("Stack remains unchanged: " + bookStack);
        } catch (EmptyStackException e) {
            System.out.println("Cannot peek an empty stack.");
        }

        // --- Popping Elements (Removing from the top) ---
        // pop(): Removes the object at the top of this stack and returns that object.
        try {
            String removedBook = bookStack.pop();
            System.out.println("Removed book (pop()): " + removedBook); // "Foundation"
            System.out.println("Stack after pop(): " + bookStack); // "Dune" is now top

            removedBook = bookStack.pop();
            System.out.println("Removed book (pop()): " + removedBook); // "Dune"
            System.out.println("Stack after pop(): " + bookStack); // "The Hobbit" is now top

        } catch (EmptyStackException e) {
            System.out.println("Cannot pop from an empty stack.");
        }

        // --- Checking if Empty ---
        // empty(): Tests if this stack is empty. (Preferred over isEmpty() for Stack clarity)
        System.out.println("Is stack empty? " + bookStack.empty()); // false

        // --- Searching for an Element ---
        // search(object): Returns the 1-based position from the top of the stack where
        //                 an object is located; the return value -1 indicates that the
        //                 object is not on the stack. Uses .equals().
        int hobbitPosition = bookStack.search("The Hobbit"); // Top is position 1
        System.out.println("Position of 'The Hobbit' (search()): " + hobbitPosition); // 1

        bookStack.push("Neuromancer"); // Add another book
        System.out.println("Stack after pushing 'Neuromancer': " + bookStack);
        hobbitPosition = bookStack.search("The Hobbit");
        System.out.println("New position of 'The Hobbit' (search()): " + hobbitPosition); // 2

        int dunePosition = bookStack.search("Dune"); // Not in the stack anymore
        System.out.println("Position of 'Dune' (search()): " + dunePosition); // -1

        // --- Emptying the stack ---
        while (!bookStack.empty()) {
            System.out.println("Popping: " + bookStack.pop());
        }
        System.out.println("Is stack empty now? " + bookStack.empty()); // true

        // Trying peek/pop on empty stack
        try {
            bookStack.peek();
        } catch (EmptyStackException e) {
            System.out.println("Caught exception trying to peek empty stack: " + e);
        }
        try {
            bookStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught exception trying to pop empty stack: " + e);
        }
    }
}
