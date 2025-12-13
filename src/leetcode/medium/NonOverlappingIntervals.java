package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int[][] points2 = new int[][]{{1, 100}, {22, 22}, {1, 11}, {2, 12}};
        System.out.println(eraseOverlapIntervals(points));
        System.out.println(eraseOverlapIntervals(points2));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int[] prev = intervals[0];
        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] curr = intervals[i];
            if (prev[1] > curr[0]) {
                res += 1;
                prev[0] = Math.max(prev[0], curr[0]);
                prev[1] = Math.min(prev[1], curr[1]);
            } else {
                prev = curr;
            }
        }

        return res;
    }
}
