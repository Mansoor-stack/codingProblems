package Array;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        // Simple 3D array: 2 layers, 3 rows, 4 columns
        int[][][] cube = new int[2][3][4];
        cube[0][1][2] = 75;
        System.out.println("cube[0][1][2]: " + cube[0][1][2]);

        // Print all elements
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // 3D String array initialization
        String[][][] colors = {
            {{"R", "G"}, {"B", "Y"}},
            {{"O", "W"}, {"G", "B"}}
        };
        System.out.println("colors[1][0][1]: " + colors[1][0][1]);
    }
}
