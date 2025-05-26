package Array;

import java.util.Arrays;

/**
 * Demonstrates declaration, initialization, memory allocation, and use cases for 3D arrays.
 */
public class ThreeDimensionalArray {

    public static void main(String[] args) {
        System.out.println("--- 3D Array Examples ---");

        // --- Declaration ---
        int[][][] cube; // Declares a 3D array of integers
        double[][][] dataPoints;

        // --- Memory Allocation & Initialization ---

        // 1. Allocating a rectangular 3D array (dimensions specified)
        // Allocates memory for a 2x3x4 cube. Elements initialized to default (0 for int).
        cube = new int[2][3][4]; // 2 layers, 3 rows per layer, 4 columns per row

        // Assigning a value
        cube[0][1][2] = 75; // First layer, second row, third column

        System.out.println("cube (after one assignment, element [0][1][2]): " + cube[0][1][2]);
        System.out.println("Iterating through the 3D cube:");
        print3DArray(cube);

        // 2. Declaration, Allocation, and Initialization with an array literal
        String[][][] rubiksCubeLayers = {
                { // Layer 0
                        {"R", "G", "B"}, // Row 0
                        {"O", "W", "Y"}, // Row 1
                        {"G", "R", "B"}  // Row 2
                },
                { // Layer 1
                        {"W", "Y", "O"},
                        {"B", "G", "R"},
                        {"Y", "O", "W"}
                }
        };

        System.out.println("\nRubik's Cube Layers (literal initialization):");
        System.out.println("Element at rubiksCubeLayers[1][0][2]: " + rubiksCubeLayers[1][0][2]); // Output: O
        print3DStringArray(rubiksCubeLayers);

        // --- Tricky/Edge Cases: Jagged 3D Arrays ---
        // While possible, they become very complex to manage.
        // Example: A 3D array where each 2D "slice" can have different row/column counts,
        // or even rows within a slice can be jagged.

        int[][][] jagged3D = new int[2][][]; // 2 layers, sub-dimensions not yet defined

        jagged3D[0] = new int[2][]; // Layer 0 has 2 rows
        jagged3D[0][0] = new int[3]; // Layer 0, Row 0 has 3 columns
        jagged3D[0][1] = new int[1]; // Layer 0, Row 1 has 1 column

        jagged3D[1] = new int[1][]; // Layer 1 has 1 row
        jagged3D[1][0] = new int[2]; // Layer 1, Row 0 has 2 columns

        jagged3D[0][0][1] = 5;
        System.out.println("\nJagged 3D array element jagged3D[0][0][1]: " + jagged3D[0][0][1]);

        // --- Use Cases ---
        // - Representing 3D spaces (e.g., voxels in medical imaging or 3D modeling)
        // - Storing data with multiple levels of categorization (e.g., sensor data over time from multiple sensors at multiple locations)
        // - Layers of 2D grids (e.g., different floors in a building map)
    }

    // Helper method to print a 3D integer array
    public static void print3DArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("  Row " + j + ": " + Arrays.toString(arr[i][j]));
            }
        }
    }

    // Helper method to print a 3D String array
    public static void print3DStringArray(String[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("  Row " + j + ": " + Arrays.toString(arr[i][j]));
            }
        }
    }
}