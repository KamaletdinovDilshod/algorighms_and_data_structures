package leetcode.medium;

public class HouseRobber {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(rob(nums));
        System.out.println(rob2(nums));
    }


    public static int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        for (int n : nums) {
            int temp = Math.max(n + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }

        return rob2;
    }

    public static int rob2(int[] nums) {
        if (nums.length == 0) return 0;
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            memo[i + 1] = Math.max(memo[i], memo[i - 1] + val);
        }
        return memo[nums.length];
    }

}
