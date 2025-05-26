package Array;

import java.util.Arrays;

/**
 * Demonstrates declaration, initialization, memory allocation, and use cases for 2D arrays (matrices).
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {
        System.out.println("--- 2D Array Examples ---");

        // --- Declaration ---
        int[][] matrix1; // Declares a 2D array of integers
        String[][] board;

        // --- Memory Allocation & Initialization ---

        // 1. Allocating a rectangular 2D array (rows and columns specified)
        // Allocates memory for a 3x4 matrix. Elements initialized to default (0 for int).
        matrix1 = new int[3][4]; // 3 rows, 4 columns
        System.out.println("matrix1 (default 3x4):");
        print2DArray(matrix1);

        // Assigning values
        matrix1[0][0] = 1;
        matrix1[1][1] = 5;
        matrix1[2][3] = 9;
        System.out.println("matrix1 (after some assignments):");
        print2DArray(matrix1);

        // 2. Declaration, Allocation, and Initialization with an array literal
        int[][] matrix2 = {
                {10, 20, 30}, // row 0
                {40, 50, 60}, // row 1
                {70, 80, 90}  // row 2
        };
        System.out.println("matrix2 (initialized with literal):");
        print2DArray(matrix2);
        System.out.println("Element at matrix2[1][2]: " + matrix2[1][2]); // Output: 60

        // --- Tricky/Edge Cases: Jagged Arrays ---
        // A 2D array where rows can have different lengths.

        // 3. Declaring and allocating a jagged array
        // First, allocate the number of rows.
        int[][] jaggedArray = new int[3][]; // 3 rows, columns not yet defined for each row

        // Then, allocate columns for each row individually.
        jaggedArray[0] = new int[2]; // Row 0 has 2 columns
        jaggedArray[1] = new int[4]; // Row 1 has 4 columns
        jaggedArray[2] = new int[1]; // Row 2 has 1 column

        // Initialize values for the jagged array
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;

        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[1][3] = 6;

        jaggedArray[2][0] = 7;

        System.out.println("jaggedArray:");
        print2DArray(jaggedArray);

        // 4. Initializing a jagged array with an array literal
        String[][] jaggedNames = {
                {"Mr.", "Mrs.", "Ms."},
                {"Smith", "Jones"},
                {"Jr.", "Sr."}
        };
        System.out.println("jaggedNames:");
        print2DStringArray(jaggedNames);

        // --- Use Cases ---
        // - Representing grids (e.g., game boards, spreadsheets)
        // - Storing matrices for mathematical operations
        // - Tabular data

       char[][] ticTacToeBoard = new char[3][3];
        // Initialize with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ticTacToeBoard[i][j] = '-';
            }
        }
        ticTacToeBoard[1][1] = 'X'; // Player X makes a move
        System.out.println("Tic-Tac-Toe Board:");
        for (char[] row : ticTacToeBoard) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Helper method to print a 2D integer array
    public static void print2DArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Helper method to print a 2D String array
    public static void print2DStringArray(String[][] arr) {
        for (String[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}