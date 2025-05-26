package Array;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 2D array (3 rows, 4 columns)
        int[][] matrix = new int[3][4];
        matrix[0][0] = 1;
        matrix[1][1] = 5;
        matrix[2][3] = 9;
        print2DArray(matrix);

        // 2D array with array literal
        int[][] matrix2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        print2DArray(matrix2);

        // Jagged array
        int[][] jagged = {
            {1, 2},
            {3, 4, 5},
            {6}
        };
        print2DArray(jagged);

        // Tic-Tac-Toe board
        char[][] board = {
            {'-', '-', '-'},
            {'-', 'X', '-'},
            {'-', '-', '-'}
        };
        for (char[] row : board) System.out.println(Arrays.toString(row));
    }

    static void print2DArray(int[][] arr) {
        for (int[] row : arr) System.out.println(Arrays.toString(row));
    }
}
