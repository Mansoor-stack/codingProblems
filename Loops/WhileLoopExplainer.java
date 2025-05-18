package Loops;

import java.util.Scanner;

/**
 * This class explains the 'while' loop in Java.
 * The 'while' loop repeatedly executes a block of statements as long as a given condition is true.
 * The condition is evaluated BEFORE the loop body is executed.
 */
public class WhileLoopExplainer {

    /**
     * Explains the basic 'while' loop.
     * Syntax: while (condition) { // body }
     * The loop continues as long as the condition is true.
     */
    public static void explainBasicWhileLoop() {
        System.out.println("--- Basic 'while' Loop ---");
        int count = 1;
        System.out.println("Counting from 1 to 5:");
        while (count <= 5) {
            System.out.print(count + " ");
            count++; // Crucial: Update the variable controlling the condition to avoid infinite loop.
        }
        System.out.println("\nLoop finished.\n");

        System.out.println("Example where condition is initially false (loop body never executes):");
        int anotherCount = 6;
        while (anotherCount <= 5) {
            // This block will not execute
            System.out.println("This won't print. anotherCount = " + anotherCount);
            anotherCount++;
        }
        System.out.println("Loop with initially false condition finished (body never executed).\n");
    }

    /**
     * Demonstrates a 'while' loop for scenarios where the number of iterations is unknown,
     * such as processing user input until a specific sentinel value is entered.
     * (Simulated input for non-interactive execution)
     */
    public static void explainWhileLoopForUnknownIterations() {
        System.out.println("--- 'while' Loop for Unknown Number of Iterations (e.g., user input) ---");
        // Scanner scanner = new Scanner(System.in); // For actual interactive input
        String input;
        System.out.println("Simulating user input. Enter words, type 'quit' to exit.");

        String[] simulatedInputs = {"hello", "world", "java", "quit", "extra"};
        int inputIndex = 0;

        // while (true) { // A common pattern for sentinel-controlled loops
        //     System.out.print("> ");
        //     input = scanner.nextLine(); // Read actual user input
        //     if (input.equalsIgnoreCase("quit")) {
        //         break; // Exit condition
        //     }
        //     System.out.println("You entered: " + input);
        // }

        while (inputIndex < simulatedInputs.length) {
            input = simulatedInputs[inputIndex++];
            System.out.println("Simulated input: " + input);
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Sentinel 'quit' detected. Exiting loop.");
                break;
            }
            System.out.println("Processing: " + input);
        }
        System.out.println("Input processing loop finished.\n");
        // scanner.close();
    }

    /**
     * Explains an infinite 'while' loop (while(true)) and how to exit it using 'break'.
     * This pattern is common when the exit condition is complex or checked within the loop body.
     */
    public static void explainInfiniteWhileLoopWithBreak() {
        System.out.println("--- Infinite 'while' Loop (with 'break') ---");
        int i = 0;
        System.out.println("This loop will run 3 times due to an internal 'break':");
        while (true) { // Condition is always true, creating a deliberate infinite loop
            System.out.println("   Iteration " + i);
            i++;
            if (i >= 3) {
                System.out.println("   Breaking the loop at i = " + i);
                break; // Essential to exit the loop
            }
        }
        System.out.println("Loop finished.\n");
    }

    public static void main(String[] args) {
        explainBasicWhileLoop();
        explainWhileLoopForUnknownIterations();
        explainInfiniteWhileLoopWithBreak();
    }
}