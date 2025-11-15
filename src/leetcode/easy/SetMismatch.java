package leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int dup = 0, lost, xor = 0;
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

    // 2 Soulution

    public static int[] findErrorNums2(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        int[] ans = {0, 0};

        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i < nums.length + 1; i++) {
            if (counter.getOrDefault(i, 0) == 0) {
                ans[1] = i;
            } else if (counter.getOrDefault(i, 0) == 2) {
                ans[0] = i;
            }
        }
        return ans;
    }
}

