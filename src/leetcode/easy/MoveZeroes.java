package leetcode.easy;


import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2 = {0, 1, 0, 3, 0};
        int[] nums3 = {1, 0};
        moveZeroes(nums);
        moveZeroes(nums2);
        moveZeroes(nums3);
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++)
            if (nums[j] != 0) nums[i++] = nums[j];
        while (i < nums.length) nums[i++] = 0;
        System.out.println(Arrays.toString(nums));

//        int temp;
//        int i = 0;
//        int j = 1;
//        while (j < nums.length) {
//            if (nums[i] == 0 && nums[j] != 0) {
//                temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i++;
//                j++;
//            } else if (nums[i] == 0 && nums[j] == 0) {
//                j++;
//            }
//        }
//
//        System.out.println(Arrays.toString(nums));
    }
}
