package leetcode.easy;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 1, 0};
        System.out.println(dominantIndex(numbers));
    }


    public static int dominantIndex(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                index = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        return (max1 >= max2 * 2) ? index : -1;
    }

}
