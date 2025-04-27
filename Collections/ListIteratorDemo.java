package RoughNote;

import java.util.LinkedList; // Using LinkedList as it benefits from ListIterator features
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        // 1. Setup: Create a LinkedList (ListIterator works with any List)
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");

        System.out.println("Original List: " + languages);
        System.out.println("-------------------------------------");

        // 2. Get a ListIterator
        //    - Extends Iterator, adding more functionality specific to Lists.
        //    - Can start from the beginning: list.listIterator()
        //    - Or start from a specific index: list.listIterator(startIndex)
        ListIterator<String> iterator = languages.listIterator(); // Starts before index 0

        // 3. Forward Traversal (like Iterator, but with index info)
        System.out.println("Forward Traversal:");
        while (iterator.hasNext()) {
            // nextIndex(): Index of the element that *would be returned* by a subsequent call to next().
            int nextIdx = iterator.nextIndex();
            // previousIndex(): Index of the element that *would be returned* by a subsequent call to previous().
            int prevIdx = iterator.previousIndex();
            // next(): Gets the next element and advances the cursor.
            String currentElement = iterator.next();
            System.out.println("  nextIndex: " + nextIdx + ", prevIndex: " + prevIdx + ", Element: " + currentElement);
        }
        // Note: After this loop, the iterator cursor is at the END of the list (after the last element).
        System.out.println("Iterator position after forward traversal: nextIndex=" + iterator.nextIndex() + ", previousIndex=" + iterator.previousIndex());
        System.out.println("-------------------------------------");


        // 4. Backward Traversal (Unique to ListIterator)
        //    - The iterator must be positioned appropriately (usually at the end) to move backward.
        //    - Our iterator is already at the end from the previous loop.
        System.out.println("Backward Traversal:");
        // hasPrevious(): Returns true if there is an element before the current cursor position.
        while (iterator.hasPrevious()) {
            int nextIdx = iterator.nextIndex();
            int prevIdx = iterator.previousIndex();
            // previous(): Gets the previous element and moves the cursor backward.
            String currentElement = iterator.previous();
            System.out.println("  nextIndex: " + nextIdx + ", prevIndex: " + prevIdx + ", Element: " + currentElement);
        }
        // Note: After this loop, the iterator cursor is at the BEGINNING of the list (before index 0).
        System.out.println("Iterator position after backward traversal: nextIndex=" + iterator.nextIndex() + ", previousIndex=" + iterator.previousIndex());
        System.out.println("-------------------------------------");


        // 5. Modification during Traversal (using set())
        //    - set(E e): Replaces the *last element returned* by either next() or previous().
        //    - Must call next() or previous() before calling set().
        System.out.println("Modification using set():");
        // Let's iterate forward again (iterator is at the beginning now)
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Python")) {
                System.out.println("  -> Found 'Python', replacing it.");
                iterator.set("Python (Updated)"); // Replace the "Python" just returned by next()
                // iterator.set("Another"); // Calling set() again without next/previous -> IllegalStateException
            }
        }
        System.out.println("List after set(): " + languages);
        System.out.println("-------------------------------------");


        // 6. Addition during Traversal (using add())
        //    - add(E e): Inserts the specified element into the list immediately *before*
        //      the element that would be returned by next(), if any, and *after* the
        //      element that would be returned by previous(), if any.
        //    - Effectively, it inserts at the current cursor position.
        //    - After add(), the last element affected is the new one; cannot call remove() or set() immediately after add().
        System.out.println("Addition using add():");
        // Let's iterate forward again (iterator is at the beginning)
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("JavaScript")) {
                System.out.println("  -> Found 'JavaScript', adding 'Go' before it.");
                iterator.add("Go"); // Add "Go". Cursor is now positioned AFTER "Go".
                                    // The next call to next() will return "JavaScript".
                // iterator.remove(); // Calling remove() after add() -> IllegalStateException
                // iterator.set("Test"); // Calling set() after add() -> IllegalStateException
            }
        }
        System.out.println("List after add(): " + languages);
        System.out.println("-------------------------------------");


        // 7. Removal during Traversal (using remove())
        //    - remove(): Removes from the list the *last element* that was returned by next() or previous().
        //    - Same rules as Iterator.remove(): Call next()/previous() first, only call once per next()/previous().
        System.out.println("Removal using remove():");
        // Reset iterator to the beginning
        iterator = languages.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("C++")) {
                System.out.println("  -> Found 'C++', removing it.");
                iterator.remove(); // Remove the "C++" just returned by next()
            }
        }
        System.out.println("List after remove(): " + languages);
        System.out.println("-------------------------------------");
    }
}
