package leetcode.medium;

public class LongestSubarrayOf1sAfterDeletingOneElement {

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1};
        int[] nums2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};


        System.out.println(longestSubarray(nums2));
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int left = 0, maxLength = 0, numberOfZeroes = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                numberOfZeroes++;
            }

            if (numberOfZeroes > 1) {
                if (nums[left] == 0) {
                    numberOfZeroes--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);

        }

        return maxLength;
    }

}
