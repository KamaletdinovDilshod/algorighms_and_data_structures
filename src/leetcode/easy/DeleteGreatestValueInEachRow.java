package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DeleteGreatestValueInEachRow {
    public static int deleteGreatestValue(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int res = 0;
        if (r == 1) for (int num : grid[0]) res += num;
        else {
            List<PriorityQueue<Integer>> list = new ArrayList<>();
            for (int[] arr : grid) {
                PriorityQueue<Integer> q = new PriorityQueue<>();
                for (int num : arr) {
                    q.add(num);
                }
                list.add(new PriorityQueue<>(q));
            }
            for (int col = 0; col < c; col++) {
                int max = -1;
                for (int row = 0; row < r; row++) {
                    max = Math.max(list.get(row).poll(), max);
                }
                res += max;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 4}, {3, 3, 1}};
        System.out.println(deleteGreatestValue(grid));
    }
}
