package leetcode.easy;

public class FindPivotIndex {
    public static void main(String[] args) {

        int[] nums = {2, 1, -1};

        // 28
        // 27

        System.out.println(pivotIndex(nums));

    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int prefixSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {

            if (prefixSum == totalSum - nums[i]) {
                return i;
            } else {
                prefixSum += nums[i];
                totalSum -= nums[i];
            }
        }

        return -1;
    }
}
