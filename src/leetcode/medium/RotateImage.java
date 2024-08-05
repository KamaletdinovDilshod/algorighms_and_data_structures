package leetcode.medium;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            int[] column = new int[matrix.length];
            int k = 0;
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.println(Arrays.toString(column));
                column[k] = matrix[j][i];
                k++;
            }
            ans[i] = column;
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = ans[i];
        }
    }
}
