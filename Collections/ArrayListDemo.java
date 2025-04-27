package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; // Import List interface

public class ArrayListDemo {

    public static void main(String[] args) {

        // --- Initialization ---
        // Using Generics (Type Safety): Recommended approach
        ArrayList<String> fruits = new ArrayList<>(); // Creates an empty ArrayList that holds Strings
        System.out.println("Initial (Generic): " + fruits + ", isEmpty: " + fruits.isEmpty() + ", size: " + fruits.size());

        // --- Adding Elements ---
        // add(element): Appends to the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("After add(): " + fruits);

        // add(index, element): Inserts at a specific index, shifting subsequent elements
        fruits.add(1, "Orange"); // Insert "Orange" at index 1
        System.out.println("After add(1, 'Orange'): " + fruits);

        // addAll(collection): Appends all elements from another collection
        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
        fruits.addAll(moreFruits);
        System.out.println("After addAll(): " + fruits);

        // --- Accessing Elements ---
        // get(index): Retrieves the element at the specified index (0-based)
        String secondFruit = fruits.get(1); // Gets "Orange"
        System.out.println("Element at index 1 (get(1)): " + secondFruit);

        // --- Modifying Elements ---
        // set(index, element): Replaces the element at the specified index
        fruits.set(2, "Banana (Updated)"); // Replace element at index 2 ("Banana")
        System.out.println("After set(2, ...): " + fruits);

        // --- Searching Elements ---
        // contains(object): Checks if the list contains the specified element (uses .equals())
        boolean hasMango = fruits.contains("Mango");
        System.out.println("Contains 'Mango': " + hasMango);
        boolean hasKiwi = fruits.contains("Kiwi");
        System.out.println("Contains 'Kiwi': " + hasKiwi);

        // containsAll(collection): Checks if the list contains all elements from another collection
        List<String> checkFruits = Arrays.asList("Apple", "Grapes");
        boolean hasAll = fruits.containsAll(checkFruits);
        System.out.println("Contains 'Apple' and 'Grapes': " + hasAll);

        // indexOf(object): Returns the index of the *first* occurrence (-1 if not found)
        int appleIndex = fruits.indexOf("Apple");
        System.out.println("Index of 'Apple': " + appleIndex);
        int kiwiIndex = fruits.indexOf("Kiwi");
        System.out.println("Index of 'Kiwi': " + kiwiIndex);

        // lastIndexOf(object): Returns the index of the *last* occurrence (-1 if not found)
        fruits.add("Apple"); // Add another Apple at the end
        System.out.println("After adding duplicate 'Apple': " + fruits);
        int lastAppleIndex = fruits.lastIndexOf("Apple");
        System.out.println("Last index of 'Apple': " + lastAppleIndex);

        // --- Removing Elements ---
        // remove(index): Removes the element at the specified index
        String removedFruit = fruits.remove(1); // Removes "Orange"
        System.out.println("After remove(1): " + fruits + ", Removed: " + removedFruit);

        // remove(object): Removes the *first* occurrence of the specified element (uses .equals())
        boolean removedMango = fruits.remove("Mango"); // Removes the first "Mango"
        System.out.println("After remove('Mango'): " + fruits + ", Removed successfully: " + removedMango);

        // removeAll(collection): Removes all elements that are also contained in the specified collection
        List<String> fruitsToRemove = Arrays.asList("Grapes", "NonExistent");
        fruits.removeAll(fruitsToRemove);
        System.out.println("After removeAll(['Grapes', 'NonExistent']): " + fruits);

        // --- Other Useful Methods ---
        // size(): Returns the number of elements
        System.out.println("Current size: " + fruits.size());

        // isEmpty(): Returns true if the list contains no elements
        System.out.println("Is empty? " + fruits.isEmpty());

        // clear(): Removes all elements from the list
        fruits.clear();
        System.out.println("After clear(): " + fruits + ", size: " + fruits.size() + ", isEmpty: " + fruits.isEmpty());

        // --- Non-Generic (Raw Type) Example - Avoid if possible! ---
        ArrayList rawList = new ArrayList();
        rawList.add("Text");
        rawList.add(123); // Can add different types (potential for ClassCastException later)
        rawList.add(true);
        System.out.println("\nRaw List (Avoid): " + rawList);
        // Requires casting and lacks compile-time type checking:
        // String text = rawList.get(0); // Compile error without cast
        String text = (String) rawList.get(0);
        // Integer num = (Integer) rawList.get(0); // Runtime ClassCastException!
        System.out.println("Casted element from raw list: " + text);
    }
}
