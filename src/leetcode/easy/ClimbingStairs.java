package leetcode.easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        if (n == 1 || n == 2) return n;
        int preprev = 1;
        int prev = 2;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = prev + preprev;
            preprev = prev;
            prev = res;
        }
        return res;
    }
}
