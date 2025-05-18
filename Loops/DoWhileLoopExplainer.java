package Loops;

import java.util.Scanner;

/**
 * This class explains the 'do-while' loop in Java.
 * The 'do-while' loop is similar to a 'while' loop, except that its body
 * is guaranteed to execute at least once because the condition is checked AFTER the body.
 */
public class DoWhileLoopExplainer {

    /**
     * Explains the basic 'do-while' loop.
     * Syntax: do { // body } while (condition);
     * The body executes, then the condition is checked. If true, the loop repeats.
     */
    public static void explainBasicDoWhileLoop() {
        System.out.println("--- Basic 'do-while' Loop ---");
        int count = 1;
        System.out.println("Counting from 1 to 5 (condition initially true):");
        do {
            System.out.print(count + " ");
            count++;
        } while (count <= 5);
        System.out.println("\nLoop finished.\n");

        System.out.println("Example where condition is initially false (body still executes once):");
        int anotherCount = 6; // Condition (anotherCount <= 5) will be false
        do {
            System.out.println("   This WILL print because body executes before condition check. anotherCount = " + anotherCount);
            anotherCount++;
        } while (anotherCount <= 5);
        System.out.println("Loop with initially false condition finished. Body executed once.\n");
    }

    /**
     * Demonstrates using a 'do-while' loop for a menu-driven program.
     * The menu is displayed at least once.
     * (Simulated input for non-interactive execution)
     */
    public static void explainDoWhileForMenu() {
        System.out.println("--- 'do-while' Loop for Menu-Driven Program (Simulated) ---");
        // Scanner scanner = new Scanner(System.in); // For actual interactive input
        int choice;
        String[] simulatedChoices = {"1", "2", "0"}; // 0 to exit
        int choiceIndex = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Perform Action A");
            System.out.println("2. Perform Action B");
            System.out.println("0. Exit");
            // System.out.print("Enter your choice: ");

            if (choiceIndex < simulatedChoices.length) {
                choice = Integer.parseInt(simulatedChoices[choiceIndex++]);
                System.out.println("Simulated choice: " + choice);
            } else {
                choice = 0; // Should not happen with correct simulation
            }
            // choice = scanner.nextInt(); // For actual input

            switch (choice) {
                case 1: System.out.println("   Action A selected."); break;
                case 2: System.out.println("   Action B selected."); break;
                case 0: System.out.println("   Exiting menu."); break;
                default: System.out.println("   Invalid choice. Please try again.");
            }
        } while (choice != 0); // Loop continues as long as choice is not 0
        System.out.println("Menu program finished.\n");
        // scanner.close();
    }

    /**
     * Shows 'do-while' for input validation, ensuring the user provides valid input at least once.
     * (This example is conceptual as it doesn't take real-time input here)
     */
    public static void explainDoWhileForInputValidation() {
        System.out.println("--- 'do-while' Loop for Input Validation (Conceptual) ---");
        System.out.println("A 'do-while' loop is excellent for input validation because you always need to get input at least once.");
        System.out.println("Example: Prompt user, get input, then check if valid. If not, repeat.");
        System.out.println("   do { \n     input = getInput(); \n   } while (!isValid(input)); \n");
    }

    public static void main(String[] args) {
        explainBasicDoWhileLoop();
        explainDoWhileForMenu();
        explainDoWhileForInputValidation();
    }
}