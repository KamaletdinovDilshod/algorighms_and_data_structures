package leetcode.easy;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int dup = 0, lost , xor = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                dup = nums[i];
            }
            xor = (xor ^ nums[i]) ^ (i + 1);
        }
        lost = (xor ^ dup);
        return new int[]{dup, lost};
    }
}

