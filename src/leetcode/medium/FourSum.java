package leetcode.medium;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 0;
        System.out.println(fourSum(nums2, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = nums.length - 1; j >= 3; j--) {
                int l = i + 1;
                int r = j - 1;
                long curSum;
                while (l < r) {
                    curSum = (long) nums[l] + nums[i] + nums[j] + nums[r];
                    boolean isValid = (curSum > Integer.MIN_VALUE && curSum < Integer.MAX_VALUE);
                    if (curSum > target) {
                        r--;
                    } else if (curSum < target) {
                        l++;
                    } else if (isValid && curSum == target) {
                        set.add(List.of(nums[i], nums[l], nums[r], nums[j]));
                        r--;
                        l++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

}
