package Loops;

/**
 * This class explains the traditional 'for' loop in Java.
 * It covers basic syntax, variations, and common use cases.
 */
public class ForLoopExplainer {

    /**
     * Explains the basic 'for' loop.
     * Syntax: for (initialization; condition; iteration) { // body }
     * 1. Initialization: Executed once when the loop begins.
     * 2. Condition: Evaluated before each iteration. If true, body executes. If false, loop terminates.
     * 3. Iteration: Executed after each iteration of the loop body.
     */
    public static void explainBasicForLoop() {
        System.out.println("--- Basic 'for' Loop ---");
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nLoop finished.\n");
    }

    /**
     * Demonstrates using a 'for' loop to iterate through an array using an index.
     */
    public static void explainForLoopWithArray() {
        System.out.println("--- 'for' Loop with Array (using index) ---");
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Iterating through an array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println("Loop finished.\n");
    }

    /**
     * Shows a 'for' loop with multiple initialization and iteration expressions.
     */
    public static void explainMultipleVariablesInForLoop() {
        System.out.println("--- 'for' Loop with Multiple Variables ---");
        System.out.println("Iterating with i increasing and j decreasing:");
        for (int i = 0, j = 5; i <= 5; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println("Loop finished.\n");
    }

    /**
     * Demonstrates 'for' loop variations where parts are omitted.
     * - No initialization: Variable declared and initialized before the loop.
     * - No condition (Infinite loop): Requires a 'break' statement.
     * - No iteration: Iteration logic handled inside the loop body.
     * - All parts omitted (Infinite loop): `for (;;)`
     */
    public static void explainForLoopVariations() {
        System.out.println("--- 'for' Loop Variations ---");

        System.out.println("1. Without Initialization (variable declared outside):");
        int k = 0;
        for (; k < 3; k++) {
            System.out.println("   k = " + k);
        }
        System.out.println("   Loop finished. Final k = " + k + "\n");

        System.out.println("2. Without Condition (Infinite loop, needs break):");
        System.out.println("   This loop will run 3 times due to internal break:");
        for (int i = 0; ; i++) { // No condition
            System.out.println("   Infinite loop (iteration " + i + ")");
            if (i >= 2) {
                System.out.println("   Breaking the 'infinite' loop.");
                break;
            }
        }
        System.out.println("   Loop finished.\n");

        System.out.println("3. Without Iteration (iteration inside body):");
        for (int i = 0; i < 3; ) { // No iteration expression
            System.out.println("   i = " + i);
            i++; // Iteration logic inside
        }
        System.out.println("   Loop finished.\n");
    }

    /**
     * Explains nested 'for' loops, often used for 2D arrays or patterns.
     */
    public static void explainNestedForLoop() {
        System.out.println("--- Nested 'for' Loop ---");
        System.out.println("Printing a 2x2 matrix pattern:");
        for (int i = 1; i <= 2; i++) { // Outer loop
            for (int j = 1; j <= 2; j++) { // Inner loop
                System.out.print("  (" + i + "," + j + ") ");
            }
            System.out.println(); // New line after each row
        }
        System.out.println("Nested loops finished.\n");
    }

    public static void main(String[] args) {
        explainBasicForLoop();
        explainForLoopWithArray();
        explainMultipleVariablesInForLoop();
        explainForLoopVariations();
        explainNestedForLoop();
    }
}