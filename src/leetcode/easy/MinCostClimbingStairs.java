package leetcode.easy;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {7, 1, 5, 3, 6, 4};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {

        int n = cost.length;
        for (int i = n - 1; i >= 0; i--) {

            if (i != n - 1 && i != n - 2) {
                cost[i] = Math.min(cost[i] + cost[i + 1], cost[i] + cost[i + 1]);
            }
        }

        return Math.min(cost[0], cost[1]);
    }
}
