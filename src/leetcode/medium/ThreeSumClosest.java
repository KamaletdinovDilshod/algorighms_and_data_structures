package leetcode.medium;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 7, 8};
        int target = 5;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int curSum;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (l < r) {
                curSum = nums[i] + nums[l] + nums[r];
                if (Math.abs(target - curSum) < Math.abs(target - ans)) {
                    ans = curSum;
                }
                if (curSum > target) {
                    r--;
                } else if (curSum < target) {
                    l++;
                } else {
                    return target;
                }
            }
        }
        return ans;
    }
}
