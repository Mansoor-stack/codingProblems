package ConditionalStatements;

/**
 * This class explains various conditional statements and loop control
 * statements in Java.
 * Each method demonstrates a specific type of conditional statement
 * with examples and console output to illustrate its behavior.
 */
public class ConditionalStatementsExplainer {

    /**
     * Explains the basic 'if' statement.
     * The 'if' statement executes a block of code only if a specified condition is true.
     */
    public void explainIfStatement() {
        System.out.println("--- 'if' Statement ---");
        int number = 10;
        System.out.println("Consider a number: " + number);

        // Example of an 'if' statement
        if (number > 5) {
            System.out.println("The number (" + number + ") is greater than 5."); // This will be printed
        }

        if (number < 5) {
            // This block will not be executed because the condition (number < 5) is false.
            System.out.println("The number (" + number + ") is less than 5.");
        }
        System.out.println("Execution continues after the 'if' block(s).\n");
    }

    /**
     * Explains the 'if-else' statement.
     * The 'if-else' statement executes one block of code if a condition is true,
     * and another block of code if the condition is false.
     */
    public void explainIfElseStatement() {
        System.out.println("--- 'if-else' Statement ---");
        int age = 15;
        System.out.println("Consider age: " + age);

        // Example of an 'if-else' statement
        if (age >= 18) {
            System.out.println("You are an adult."); // This will not be printed
        } else {
            System.out.println("You are a minor."); // This will be printed
        }
        System.out.println("One of the two blocks (if or else) is always executed based on the condition.\n");
    }

    /**
     * Explains the 'if-else-if' ladder.
     * The 'if-else-if' ladder is used to decide among several mutually exclusive options.
     * The 'if' statements are evaluated from top to bottom.
     * As soon as one of the conditions controlling an 'if' is true,
     * the statement associated with that 'if' is executed, and the rest of the ladder is bypassed.
     * If none of the conditions are true, then the final 'else' statement (if present) will be executed.
     */
    public void explainIfElseIfLadder() {
        System.out.println("--- 'if-else-if' Ladder ---");
        int score = 75;
        System.out.println("Consider score: " + score);
        char grade;

        // Example of an 'if-else-if' ladder
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) { // This condition is true (75 >= 70)
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your grade is: " + grade);
        System.out.println("Only the block corresponding to the first true condition is executed.\n");
    }

    /**
     * Explains nested 'if' statements.
     * A nested 'if' statement is an 'if' statement that is the target of another 'if' or 'else'.
     * This allows for more complex conditional logic by checking conditions within conditions.
     */
    public void explainNestedIfStatement() {
        System.out.println("--- Nested 'if' Statement ---");
        int num1 = 10;
        boolean isLoggedIn = true;
        System.out.println("Consider num1 = " + num1 + " and isLoggedIn = " + isLoggedIn);

        // Example of a nested 'if' statement
        if (isLoggedIn) {
            System.out.println("Outer if: User is logged in.");
            if (num1 > 5) {
                System.out.println("Inner if: num1 (" + num1 + ") is greater than 5."); // This will be printed
            } else {
                System.out.println("Inner if: num1 (" + num1 + ") is not greater than 5.");
            }
        } else {
            System.out.println("Outer if: User is not logged in.");
        }
        System.out.println("Nested ifs allow for hierarchical condition checks.\n");
    }

    /**
     * Explains the 'switch' statement.
     * The 'switch' statement allows a variable to be tested for equality against a list of values (cases).
     * The 'break' statement is crucial to exit the switch block after a case is executed.
     * If 'break' is omitted, execution "falls through" to the next case.
     * The 'default' case is executed if no other case matches.
     */
    public void explainSwitchStatement() {
        System.out.println("--- 'switch' Statement ---");
        int dayOfWeek = 3; // 1 for Sunday, 2 for Monday, ..., 7 for Saturday
        String dayName;
        System.out.println("Consider dayOfWeek (1-7, where 1=Sunday): " + dayOfWeek);

        switch (dayOfWeek) {
            case 1: dayName = "Sunday"; break;
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break; // Matches
            case 4: dayName = "Wednesday"; break;
            case 5: dayName = "Thursday"; break;
            case 6: dayName = "Friday"; break;
            case 7: dayName = "Saturday"; break;
            default: dayName = "Invalid day"; break;
        }
        System.out.println("The day is: " + dayName);
        System.out.println("'switch' is useful for multi-way branching based on a single variable's value.\n");
    }

    /**
     * Explains the Ternary Operator (Conditional Operator).
     * The ternary operator is a shorthand for an 'if-else' statement.
     * Syntax: variable = (condition) ? expressionIfTrue : expressionIfFalse;
     */
    public void explainTernaryOperator() {
        System.out.println("--- Ternary Operator (?:) ---");
        int a = 10;
        int b = 20;
        System.out.println("Consider a = " + a + " and b = " + b);

        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println("Result of (a > b) ? \"a is greater\" : \"b is greater or equal\": " + result);

        int max = (a > b) ? a : b;
        System.out.println("The maximum value between a and b is: " + max);
        System.out.println("Ternary operator provides a concise way to write simple if-else logic.\n");
    }

    /**
     * Explains the unlabelled 'break' statement.
     * The unlabelled 'break' statement terminates the innermost 'switch', 'for', 'while', or 'do-while' statement.
     */
    public void explainUnlabelledBreak() {
        System.out.println("--- Unlabelled 'break' Statement ---");
        System.out.println("Example with a 'for' loop:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking loop at i = " + i);
                break; // Exits the 'for' loop
            }
            System.out.println("i = " + i);
        }
        System.out.println("Loop finished or was broken.\n");
    }

    /**
     * Explains the labelled 'break' statement.
     * The labelled 'break' statement terminates an outer statement, which is identified by the label.
     * It's useful for breaking out of nested loops.
     */
    public void explainLabelledBreak() {
        System.out.println("--- Labelled 'break' Statement ---");
        System.out.println("Example with nested 'for' loops:");
        outerLoop: // Label for the outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop: i = " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("  Inner loop: j = " + j);
                if (i == 2 && j == 2) {
                    System.out.println("    Breaking out of 'outerLoop' from inner loop when i=" + i + ", j=" + j);
                    break outerLoop; // Exits the loop labelled 'outerLoop'
                }
            }
        }
        System.out.println("Execution continues after the labelled break.\n");
    }

    /**
     * Explains the unlabelled 'continue' statement.
     * The unlabelled 'continue' statement skips the current iteration of the innermost
     * 'for', 'while', or 'do-while' loop and proceeds to the next iteration.
     */
    public void explainUnlabelledContinue() {
        System.out.println("--- Unlabelled 'continue' Statement ---");
        System.out.println("Example with a 'for' loop (skipping even numbers):");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping iteration for i = " + i + " (it's even)");
                continue; // Skips the rest of the loop body for this iteration
            }
            System.out.println("Processing i = " + i);
        }
        System.out.println("Loop finished.\n");
    }

    /**
     * Explains the labelled 'continue' statement.
     * The labelled 'continue' statement skips the current iteration of an outer loop
     * (identified by the label) and proceeds to its next iteration.
     */
    public void explainLabelledContinue() {
        System.out.println("--- Labelled 'continue' Statement ---");
        System.out.println("Example with nested 'for' loops:");
        outer: // Label for the outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer loop iteration: i = " + i);
            for (int j = 1; j <= 3; j++) {
                if (i == 1 && j == 2) {
                    System.out.println("  Skipping to next iteration of 'outer' loop when i=" + i + ", j=" + j);
                    continue outer; // Continues with the next iteration of the 'outer' loop
                }
                System.out.println("    Inner loop: j = " + j);
            }
        }
        System.out.println("Execution continues after loops.\n");
    }

    /**
     * Main method to demonstrate the explanations.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        ConditionalStatementsExplainer explainer = new ConditionalStatementsExplainer();

        explainer.explainIfStatement();
        explainer.explainIfElseStatement();
        explainer.explainIfElseIfLadder();
        explainer.explainNestedIfStatement();
        explainer.explainSwitchStatement();
        explainer.explainTernaryOperator();
        explainer.explainUnlabelledBreak();
        explainer.explainLabelledBreak();
        explainer.explainUnlabelledContinue();
        explainer.explainLabelledContinue();
    }
}