package leetcode.easy;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int tmp;
        while (i <= j) {
            if (nums[i] % 2 == 1 && nums[j] % 2 == 0) {
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            } else if (nums[i] % 2 == 1 && nums[j] % 2 != 0) {
                j--;
            } else {
                i++;
            }
        }
        return nums;
    }
}
