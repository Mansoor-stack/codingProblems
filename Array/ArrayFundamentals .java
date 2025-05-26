package Array;

import java.util.Arrays;

public class ArrayFundamentals {

    public static void main(String[] args) {
        // 1. Declaration & Initialization
        int[] numbers = new int[5]; // Default values are 0
        System.out.println("numbers (new int[5]): " + Arrays.toString(numbers));

        double[] prices = {10.99, 5.50, 7.25};
        System.out.println("prices: " + Arrays.toString(prices));

        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("names: " + Arrays.toString(names) + ", length: " + names.length);

        // 2. Anonymous Arrays & Passing to Methods
        printSum(new int[]{1, 2, 3});

        // 3. Edge Cases
        int[] emptyArray = new int[0];
        System.out.println("emptyArray length: " + emptyArray.length);

        String[] words = new String[3]; // [null, null, null]
        words[0] = "Hello";
        words[1] = "World";
        System.out.println("words: " + Arrays.toString(words));

        // 4. Reference vs Cloning
        int[] original = {1, 2, 3};
        int[] reference = original;
        reference[0] = 100;
        System.out.println("original (after reference change): " + Arrays.toString(original));
        int[] clone = original.clone();
        clone[0] = 999;
        System.out.println("original (after clone change): " + Arrays.toString(original));
        System.out.println("clone: " + Arrays.toString(clone));

        // 5. Copying
        int[] copy = Arrays.copyOf(original, original.length);
        copy[1] = 777;
        System.out.println("original (after copy change): " + Arrays.toString(original));
        System.out.println("copy: " + Arrays.toString(copy));

        // 6. Use Case: Student Grades
        double[] grades = {85.5, 92.0, 78.3, 95.7};
        System.out.println("Student Grades: " + Arrays.toString(grades));
        System.out.println("Maximum grade: " + findMax(grades));

        // 7. Array of Objects
        Student[] students = {
            new Student("Alice", 101),
            new Student("Bob", 102)
        };
        System.out.println("Class Roster:");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void printSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        System.out.println("Sum: " + sum);
    }

    public static double findMax(double[] arr) {
        double max = Double.NEGATIVE_INFINITY;
        for (double v : arr) {
            if (v > max) max = v;
        }
        return max;
    }
}

class Student {
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
