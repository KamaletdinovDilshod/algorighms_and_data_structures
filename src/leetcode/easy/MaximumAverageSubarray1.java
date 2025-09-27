package leetcode.easy;


public class MaximumAverageSubarray1 {

    public static void main(String[] args) {

        int[] nums = {0, 1, 1, 3, 3};
        System.out.println(findMaxAverage(nums, 4));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;
        double maxSum = 0;

        // calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }
}
