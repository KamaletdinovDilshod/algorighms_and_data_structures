package leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));
        System.out.println(equalPairs2(grid));
    }

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowCounts = new HashMap<>();

        for (int[] ints : grid) {
            String rowString = Arrays.toString(ints);
            rowCounts.put(rowString, rowCounts.getOrDefault(rowString, 0) + 1);
        }

        int equalPairsCount = 0;

        for (int j = 0; j < n; j++) {
            int[] colArray = new int[n];
            for (int i = 0; i < n; i++) {
                colArray[i] = grid[i][j];
            }

            String colString = Arrays.toString(colArray);
            if (rowCounts.containsKey(colString)) {
                equalPairsCount += rowCounts.get(colString);
            }
        }
        return equalPairsCount;
    }

    // second approach
    public static int equalPairs2(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int[] ints : grid) {
            for (int j = 0; j < n; j++) {
                boolean match = true;
                for (int k = 0; k < n; k++) {
                    if (ints[k] != grid[k][j]) {
                        match = false;
                        break;
                    }
                }
                if (match) count++;
            }
        }
        return count;
    }

}
