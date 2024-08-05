package leetcode.medium;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
//        for (int i = 0; i < nums.length - 1; i++) {
//            int min_ind = i;
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[j] < nums[min_ind]) {
//                    min_ind = j;
//                }
//            }
//                int temp = nums[min_ind];
//                nums[min_ind] = nums[i];
//                nums[i] = temp;
//        }
        System.out.println(Arrays.toString(nums));
    }
}
