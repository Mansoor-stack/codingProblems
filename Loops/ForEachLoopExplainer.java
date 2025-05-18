package Loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class explains the Enhanced 'for' Loop (also known as for-each loop) in Java.
 * It's used for iterating through elements of arrays and collections.
 */
public class ForEachLoopExplainer {

    /**
     * Explains the enhanced 'for' loop with an array.
     * Syntax: for (type variableName : arrayOrCollection) { // body }
     * It simplifies iteration without needing an index variable.
     */
    public static void explainEnhancedForLoopWithArray() {
        System.out.println("--- Enhanced 'for' Loop (For-Each) with Array ---");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Iterating through an array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nLoop finished.\n");

        System.out.println("Attempting to modify primitive elements (won't affect original array):");
        // 'number' inside the loop is a copy of the element's value for primitives.
        for (int number : numbers) {
            number = number * 10; // This modifies the copy, not the original array element.
        }
        System.out.print("Array after attempting modification: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("\nPrimitives are passed by value; original array is unchanged.\n");
    }

    /**
     * Explains the enhanced 'for' loop with a Collection (e.g., ArrayList).
     */
    public static void explainEnhancedForLoopWithCollection() {
        System.out.println("--- Enhanced 'for' Loop (For-Each) with Collection (List) ---");
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("Iterating through a List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Loop finished.\n");
    }

    // Helper class for demonstrating object modification
    static class MutableObject {
        int value;
        public MutableObject(int value) { this.value = value; }
        public void setValue(int value) { this.value = value; }
        @Override public String toString() { return "MutableObject{value=" + value + "}"; }
    }

    /**
     * Demonstrates modifying mutable objects within an enhanced 'for' loop.
     * The loop variable holds a reference to the object, so modifications affect the original object.
     */
    public static void explainEnhancedForLoopModifyingObjects() {
        System.out.println("--- Enhanced 'for' Loop - Modifying Mutable Objects ---");
        List<MutableObject> objects = new ArrayList<>();
        objects.add(new MutableObject(10));
        objects.add(new MutableObject(20));

        System.out.println("Objects before modification:");
        for (MutableObject obj : objects) { System.out.println(obj); }

        System.out.println("Modifying objects' state within the loop:");
        for (MutableObject obj : objects) {
            obj.setValue(obj.value * 2); // Modifies the actual object in the list
        }

        System.out.println("Objects after modification:");
        for (MutableObject obj : objects) { System.out.println(obj); }
        System.out.println("Mutable objects can be modified as the loop variable holds a reference.\n");
    }

    /**
     * Highlights limitations of the enhanced 'for' loop:
     * 1. No direct access to the element's index.
     * 2. Cannot modify the structure of the collection (add/remove elements) during iteration
     *    without an Iterator (doing so directly throws ConcurrentModificationException).
     * 3. Cannot iterate backwards or skip elements in a custom way easily.
     */
    public static void explainLimitationsOfEnhancedForLoop() {
        System.out.println("--- Limitations of Enhanced 'for' Loop ---");
        System.out.println("1. No access to index: Use traditional 'for' loop if index is needed.");
        System.out.println("2. Cannot modify collection structure (add/remove elements) directly during iteration.");
        System.out.println("   Attempting to do so (e.g., list.remove()) typically causes ConcurrentModificationException.");
        System.out.println("   Use an Iterator's remove() method or a traditional for loop (carefully) for such modifications.");
        System.out.println("3. Less flexible for complex iteration patterns (e.g., iterating backwards, skipping elements).");
        System.out.println("   Traditional 'for' loop offers more control in these scenarios.\n");
    }

    public static void main(String[] args) {
        explainEnhancedForLoopWithArray();
        explainEnhancedForLoopWithCollection();
        explainEnhancedForLoopModifyingObjects();
        explainLimitationsOfEnhancedForLoop();
    }
}