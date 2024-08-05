package leetcode.medium;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 1, 2, 2, 3, 4, 4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        int k = 1;
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] == nums[i]) {
                if (counter < 2) {
                    nums[k++] = nums[i];
                    j++;
                }
                counter++;
            } else {
                nums[k++] = nums[i];
                j = i;
                counter = 1;
            }
        }
        return k;
    }
}