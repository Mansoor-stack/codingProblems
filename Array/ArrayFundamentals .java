package Array;

import java.util.Arrays;

/**
 * Demonstrates declaration, initialization, and memory allocation of 1D arrays in Java.
 * It also covers various use cases from straightforward to tricky scenarios.
 */
public class ArrayFundamentals {

    public static void main(String[] args) {
        System.out.println("--- 1D Array Examples ---");

        // --- Declaration ---
        // Declares an array of integers. 'numbers1' is a reference, memory not yet allocated.
        int[] numbers1;

        // Another way to declare (less common in Java, more C/C++ style)
        int numbers2[];

        // --- Memory Allocation & Initialization ---

        // 1. Allocation with 'new' and default initialization
        // Allocates memory for 5 integers. Elements are initialized to default value (0 for int).
        numbers1 = new int[5];
        System.out.println("numbers1 (after new int[5]): " + Arrays.toString(numbers1)); // Output: [0, 0, 0, 0, 0]

        // 2. Declaration, Allocation, and Initialization in one line (with 'new')
        double[] prices = new double[3]; // Default initialized to 0.0
        System.out.println("prices (default): " + Arrays.toString(prices));
        prices[0] = 10.99;
        prices[1] = 5.50;
        prices[2] = 7.25;
        System.out.println("prices (after assignment): " + Arrays.toString(prices));

        // 3. Array Literal (Declaration, Allocation, and Initialization with values)
        // The size of the array is determined by the number of elements provided.
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("names: " + Arrays.toString(names));
        System.out.println("Length of names array: " + names.length);

        // 4. Anonymous Array (useful for passing to methods or re-initializing)
        numbers1 = new int[]{10, 20, 30, 40, 50}; // Re-assigning numbers1
        System.out.println("numbers1 (re-initialized with anonymous array): " + Arrays.toString(numbers1));
        printSum(new int[]{1, 2, 3}); // Passing an anonymous array to a method

        // --- Tricky/Edge Cases ---

        // 5. Zero-length array
        // Perfectly valid, but has no elements.
        int[] emptyArray = new int[0];
        System.out.println("emptyArray length: " + emptyArray.length); // Output: 0
        // System.out.println(emptyArray[0]); // ArrayIndexOutOfBoundsException

        // 6. Array of Objects
        // Elements are initialized to null by default.
        String[] words = new String[3];
        System.out.println("words (default object array): " + Arrays.toString(words)); // Output: [null, null, null]
        words[0] = "Hello";
        words[1] = "World";
        // words[2] remains null
        System.out.println("words (after assignment): " + Arrays.toString(words));

        // 7. Array assignment (reference copy, not value copy)
        int[] originalArray = {1, 2, 3};
        int[] referencedArray = originalArray; // Both point to the same memory location

        System.out.println("originalArray: " + Arrays.toString(originalArray));
        System.out.println("referencedArray: " + Arrays.toString(referencedArray));

        referencedArray[0] = 100; // Modifying referencedArray also modifies originalArray
        System.out.println("originalArray (after modifying referencedArray): " + Arrays.toString(originalArray));
        System.out.println("referencedArray (after modification): " + Arrays.toString(referencedArray));

        // 8. Cloning an array (to get a separate copy)
        int[] clonedArray = originalArray.clone();
        clonedArray[0] = 999; // Modifying clonedArray does NOT affect originalArray
        System.out.println("originalArray (after modifying clonedArray): " + Arrays.toString(originalArray));
        System.out.println("clonedArray: " + Arrays.toString(clonedArray));

        // Using Arrays.copyOf() for cloning (more flexible)
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        copiedArray[1] = 777;
        System.out.println("originalArray (after modifying copiedArray): " + Arrays.toString(originalArray));
        System.out.println("copiedArray: " + Arrays.toString(copiedArray));

        // --- Use Cases ---

        // Storing a collection of related data
        double[] studentGrades = {85.5, 92.0, 78.3, 95.7};

        // Iterating through an array
        System.out.print("Student Grades: ");
        for (double grade : studentGrades) {
            System.out.print(grade + " ");
        }
        System.out.println();

        // Finding the maximum value
        if (studentGrades.length > 0) {
            double maxGrade = studentGrades[0];
            for (int i = 1; i < studentGrades.length; i++) {
                if (studentGrades[i] > maxGrade) {
                    maxGrade = studentGrades[i];
                }
            }
            System.out.println("Maximum grade: " + maxGrade);
        }

        // Array of custom objects
        Student[] classRoster = new Student[2];
        classRoster[0] = new Student("Alice", 101);
        classRoster[1] = new Student("Bob", 102);
        System.out.println("Class Roster:");
        for (Student student : classRoster) {
            System.out.println(student); // Assumes Student class has a toString() method
        }
    }

    public static void printSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        System.out.println("Sum of anonymous array: " + sum);
    }
}

class Student { // Helper class for object array example
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}