package leetcode.medium;

import java.util.Arrays;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int direction = 1;
        int count = 1;
        while (left <= right && top <= bottom) {
            if (direction == 1) {
                for (int i = left; i <= right; i++){
                    matrix[left][i] = count;
                count += 1;
            }
                direction = 2;
                top++;
            } else if (direction == 2) {
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = count;
                    count += 1;
                }
                direction = 3;
                right--;
            } else if (direction == 3) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = count;
                    count += 1;
                }
                    direction = 4;
                bottom--;

            } else {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = count;
                    count += 1;
                }
                direction = 1;
                left++;
            }
        }
        return matrix;
    }
}