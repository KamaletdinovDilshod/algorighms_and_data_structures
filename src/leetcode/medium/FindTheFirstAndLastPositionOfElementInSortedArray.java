package leetcode.medium;

import java.util.Arrays;

public class FindTheFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(Arrays.toString(searchRange(nums, 2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int fi = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] > target){
                high = mid - 1;
            } else if (nums[mid] == target) {
                fi = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        low = 0;
        high = nums.length - 1;
        int li = -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] > target){
                high = mid - 1;
            } else if (nums[mid] == target) {
                li = mid;
                low = mid + 1;
            } else {
                low = mid +1;
            }
        }
        return new int[]{fi, li};
    }
}
