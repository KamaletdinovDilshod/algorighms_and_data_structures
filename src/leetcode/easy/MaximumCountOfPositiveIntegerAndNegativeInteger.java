package leetcode.easy;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    public static int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        if (nums[0] > 0) return nums.length;
        for (int num : nums) {
            if (num > 0) pos += 1;
            else if (num < 0) neg += 1;
        }
        return Math.max(pos, neg);
    }

    public static void main(String[] args) {
        int[] nums = {-4, -3, -2, -1, 0, 4, 5, 6, 7, 8};
        System.out.println(maximumCount(nums));
    }
}
