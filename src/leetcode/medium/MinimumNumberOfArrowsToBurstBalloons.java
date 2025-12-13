package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumNumberOfArrowsToBurstBalloons {
    public static void main(String[] args) {
        int[][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        int[] prev = points[0];
        int res = points.length;

        for (int i = 1; i < points.length; i++) {
            int[] curr = points[i];
            System.out.println(Arrays.toString(curr));
            System.out.println(Arrays.toString(prev));
            if (prev[1] >= curr[0]) {
                res -= 1;
                prev[0] = Math.max(prev[0], curr[0]);
                prev[1] = Math.min(prev[1], curr[1]);
            } else {
                prev = curr;
            }

        }
        return res;
    }
}
