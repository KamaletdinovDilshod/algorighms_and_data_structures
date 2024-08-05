package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int direction = 1;
        while (left <= right && top <= bottom) {
            if (direction == 1) {
                for (int i = left; i <= right; i++)
                    ans.add(matrix[left][i]);
                direction = 2;
                top++;
            } else if (direction == 2) {
                for (int i = top; i <= bottom; i++)
                    ans.add(matrix[i][right]);
                direction = 3;
                right--;
            } else if (direction == 3) {
                for (int i = right; i >= left; i--)
                    ans.add(matrix[bottom][i]);
                direction = 4;
                bottom--;

            } else {
                for (int i = bottom; i >= top; i--)
                    ans.add(matrix[i][left]);
                    direction = 1;
                    left++;
            }
        }
        return ans;
    }
}
