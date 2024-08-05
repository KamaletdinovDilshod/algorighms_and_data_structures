package leetcode.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maincount = 0;
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                count++;
                i++;
            } else {
                    count = 0;
                    i++;
                }
            if (maincount < count){
                maincount = count;
            }
        }
        return maincount;
    }
}