package leetcode.medium;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        for (int num : nums) {
            sum = Math.max(sum, 0) + num;
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
