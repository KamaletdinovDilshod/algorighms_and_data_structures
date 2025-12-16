package leetcode.easy;

import java.util.Arrays;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(Arrays.toString(cost));
            if (i != n - 1 && i != n - 2) {
                cost[i] = Math.min(cost[i] + cost[i + 1], cost[i] + cost[i + 2]);
            }
        }

        return Math.min(cost[0], cost[1]);
    }
}
