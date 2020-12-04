package ClassDemo.Algorithms.Arrays;

import java.util.Arrays;

public class rotateMatrix {
    public static void rotate(int[][] matrix){
        int[][] shadow = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                shadow[i][j] = matrix[matrix.length-1-j][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = shadow[i][j];
            }
            //System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        int[][] testarray = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(testarray);
    }
}
